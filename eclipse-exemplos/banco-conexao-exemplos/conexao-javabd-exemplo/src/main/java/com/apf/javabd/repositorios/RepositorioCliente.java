package com.apf.javabd.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.apf.javabd.dominio.Cliente;
import com.apf.javabd.utilitarios.Mensagem;

public class RepositorioCliente extends RepositorioBase{

	private static final String COMANDO_BASE = " SELECT * From Cliente ";
	private static final String COLUNA_ID = "id";
	private static final String COLUNA_NOME = "nome";
	private static final String COLUNA_CNPJ = "cnpj";
	private static final String COLUNA_RAZAO_SOCIAL = "razao_social";
	private static final String COLUNA_EMAIL = "email";
	private static final String COLUNA_TELEFONE = "telefone";
	private static final String CONDICIONAL_WHERE = " WHERE ";

	public boolean salvar(Cliente cliente) {
		boolean salvo = false;
		String nome = cliente.getNome();
		String cnpj = cliente.getCnpj();
		String razaoSocial = cliente.getRazaoSocial();
		String email = cliente.getEmail();
		String telefone = cliente.getTelefone();
		try {
			comando = conexaoSisProjeto
					.prepareStatement("INSERT INTO Cliente (" + COLUNA_ID + ","
							+ COLUNA_NOME + "," + COLUNA_CNPJ + ", "
							+ COLUNA_RAZAO_SOCIAL + ", " + COLUNA_EMAIL + ", "
							+ COLUNA_TELEFONE + ") VALUES (DEFAULT, '" + nome
							+ "','" + cnpj + "','" + razaoSocial + "','"
							+ email + "','" + telefone + "')");
			comando.executeUpdate();
			salvo = true;
			encerrarComando();
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
			salvo = false;
		}
		return salvo;
	}

	public boolean alterar(Cliente cliente) {
		boolean alterado = false;
		try {
			String id = cliente.getId().toString();
			String nome = cliente.getNome();
			String cnpj = cliente.getCnpj();
			String razaoSocial = cliente.getRazaoSocial();
			String email = cliente.getEmail();
			String telefone = cliente.getTelefone();
			comando = conexaoSisProjeto.prepareStatement("UPDATE Cliente SET "
					+ COLUNA_NOME + " = '" + nome + "', " + COLUNA_CNPJ
					+ " = '" + cnpj + "', " + COLUNA_RAZAO_SOCIAL + " = '"
					+ razaoSocial + "', " + COLUNA_EMAIL + " = '" + email
					+ "', " + COLUNA_TELEFONE + " = '" + telefone + "'"
					+ CONDICIONAL_WHERE + COLUNA_ID + " = " + id);
			comando.executeUpdate();
			encerrarComando();
			alterado = true;
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
			alterado = false;
		}
		return alterado;
	}

	public boolean excluir(Long id) {
		boolean excluido = false;
		try {
			comando = conexaoSisProjeto.prepareStatement("DELETE FROM Cliente "
					+ CONDICIONAL_WHERE + COLUNA_ID + " = "
					+ String.valueOf(id));
			comando.executeUpdate();
			encerrarComando();
			excluido = true;
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		return excluido;
	}

	public List<Cliente> obterTodos() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			comando = conexaoSisProjeto.prepareStatement(COMANDO_BASE);
			ResultSet clientesObtido = comando.executeQuery();
			while (clientesObtido.next()) {
				Cliente cliente = new Cliente();
				Long id = clientesObtido.getLong(COLUNA_ID);
				String nome = clientesObtido.getString(COLUNA_NOME);
				String cnpj = clientesObtido.getString(COLUNA_CNPJ);
				String razaoSocial = clientesObtido
						.getString(COLUNA_RAZAO_SOCIAL);
				String email = clientesObtido.getString(COLUNA_EMAIL);
				String telefone = clientesObtido.getString(COLUNA_TELEFONE);

				cliente.setId(id);
				cliente.setNome(nome);
				cliente.setCnpj(cnpj);
				cliente.setRazaoSocial(razaoSocial);
				cliente.setEmail(email);
				cliente.setTelefone(telefone);

				clientes.add(cliente);
			}
			encerrarComando();
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		return clientes;
	}

	public Cliente obterPorId(Long id) {
		Cliente c = null;
		try {
			comando = conexaoSisProjeto.prepareStatement(COMANDO_BASE
					+ CONDICIONAL_WHERE + COLUNA_ID + " = "
					+ String.valueOf(id));

			ResultSet clienteObtido = comando.executeQuery();

			if (clienteObtido.next()) {
				id = clienteObtido.getLong(COLUNA_ID);
				String nome = clienteObtido.getString(COLUNA_NOME);
				String cnpj = clienteObtido.getString(COLUNA_CNPJ);
				String razaoSocial = clienteObtido
						.getString(COLUNA_RAZAO_SOCIAL);
				String email = clienteObtido.getString(COLUNA_EMAIL);
				String telefone = clienteObtido.getString(COLUNA_TELEFONE);

				c = new Cliente();
				c.setId(id);
				c.setNome(nome);
				c.setCnpj(cnpj);
				c.setRazaoSocial(razaoSocial);
				c.setEmail(email);
				c.setTelefone(telefone);
			} else {
				Mensagem.exibirMensagem("Nenhum registro foi encontrado.");
			}
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}

		return c;
	}

	public List<Cliente> pesquisar(Cliente cliente) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "";

		Long id = cliente.getId();
		String nome = cliente.getNome();
		String cnpj = cliente.getCnpj();
		String razaoSocial = cliente.getRazaoSocial();
		String email = cliente.getEmail();
		String telefone = cliente.getTelefone();

		sql += COMANDO_BASE;

		if (cliente != null) {
			sql += CONDICIONAL_WHERE;
		}

		if (nome != null && !nome.isEmpty()) {
			sql += " nome = '" + nome + "'";
		} else if (cnpj != null && !cnpj.isEmpty()) {
			sql += " cnpj = '" + cnpj + "'";
		} else if (razaoSocial != null && !razaoSocial.isEmpty()) {
			sql += " razao_social = '" + razaoSocial + "'";
		} else if (email != null && !email.isEmpty()) {
			sql += " email = '" + email + "'";
		} else if (telefone != null && !telefone.isEmpty()) {
			sql += " telefone = '" + telefone + "'";
		}
		Cliente c = null;
		try {
			comando = conexaoSisProjeto.prepareStatement(sql);

			ResultSet clienteObtido = comando.executeQuery();

			while (clienteObtido.next()) {
				id = clienteObtido.getLong(COLUNA_ID);
				nome = clienteObtido.getString(COLUNA_NOME);
				cnpj = clienteObtido.getString(COLUNA_CNPJ);
				razaoSocial = clienteObtido.getString(COLUNA_RAZAO_SOCIAL);
				email = clienteObtido.getString(COLUNA_EMAIL);
				telefone = clienteObtido.getString(COLUNA_TELEFONE);

				c = new Cliente();

				c.setId(id);
				c.setNome(nome);
				c.setCnpj(cnpj);
				c.setRazaoSocial(razaoSocial);
				c.setEmail(email);
				c.setTelefone(telefone);

				clientes.add(c);
			}
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}

		return clientes;
	}

}

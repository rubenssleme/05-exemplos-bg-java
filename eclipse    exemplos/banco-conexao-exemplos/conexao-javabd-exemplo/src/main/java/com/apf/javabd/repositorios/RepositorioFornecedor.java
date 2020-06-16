package com.apf.javabd.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.apf.javabd.dominio.Fornecedor;
import com.apf.javabd.utilitarios.Mensagem;

public class RepositorioFornecedor extends RepositorioBase {

	private static final String COMANDO_BASE = " SELECT * From Fornecedor ";
	private static final String COLUNA_ID = "id";
	private static final String COLUNA_NOME = "nome";
	private static final String COLUNA_CNPJ = "cnpj";
	private static final String COLUNA_NOME_FANTASIA = "nome_fantasia";
	private static final String CONDICIONAL_WHERE = " WHERE ";

	public boolean salvar(Fornecedor fornecedor) {
		boolean salvo = false;

		String nome = fornecedor.getNome();
		String cnpj = fornecedor.getCnpj();
		String nomeFantasia = fornecedor.getNomeFantasia();

		try {
			comando = conexaoSisProjeto
					.prepareStatement("INSERT INTO Fornecedor (" + COLUNA_NOME
							+ ", " + COLUNA_NOME_FANTASIA + ", " + COLUNA_CNPJ
							+ ") VALUES ('" + nome + "','" + nomeFantasia
							+ "','" + cnpj + "')");
			comando.executeUpdate();
			encerrarComando();
			salvo = true;
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
			salvo = false;
		}
		return salvo;
	}

	public boolean alterar(Fornecedor fornecedor) {
		boolean alterado = false;

		try {
			String id = fornecedor.getId().toString();
			String nome = fornecedor.getNome();
			String cnpj = fornecedor.getCnpj();
			String nomeFantasia = fornecedor.getNomeFantasia();

			comando = conexaoSisProjeto
					.prepareStatement("UPDATE Fornecedor SET " + COLUNA_NOME
							+ " = '" + nome + "', " + COLUNA_NOME_FANTASIA
							+ " = '" + nomeFantasia + "', " + COLUNA_CNPJ
							+ " = '" + cnpj + "'" + CONDICIONAL_WHERE
							+ COLUNA_ID + " = " + id);
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
			comando = conexaoSisProjeto
					.prepareStatement("DELETE FROM Fornecedor "
							+ CONDICIONAL_WHERE + " " + COLUNA_ID + " = "
							+ String.valueOf(id));
			comando.executeUpdate();
			encerrarComando();
			excluido = true;
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		return excluido;
	}

	public List<Fornecedor> obterTodos() {
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		try {
			comando = conexaoSisProjeto.prepareStatement(COMANDO_BASE);

			ResultSet fornecedoresObtido = comando.executeQuery();

			while (fornecedoresObtido.next()) {
				Fornecedor fornecedor = new Fornecedor();

				Long id = fornecedoresObtido.getLong(COLUNA_ID);
				String nome = fornecedoresObtido.getString(COLUNA_NOME);
				String cnpj = fornecedoresObtido.getString(COLUNA_CNPJ);
				String nomeFantasia = fornecedoresObtido
						.getString(COLUNA_NOME_FANTASIA);

				fornecedor.setId(id);
				fornecedor.setNome(nome);
				fornecedor.setCnpj(cnpj);
				fornecedor.setNomeFantasia(nomeFantasia);

				fornecedores.add(fornecedor);
			}
			encerrarComando();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fornecedores;
	}

	public Fornecedor obterPorId(Long id) {
		Fornecedor f = null;
		try {
			comando = conexaoSisProjeto.prepareStatement(COMANDO_BASE
					+ CONDICIONAL_WHERE + COLUNA_ID + " = " + id);

			ResultSet fornecedorObtido = comando.executeQuery();

			if (fornecedorObtido.next()) {
				id = fornecedorObtido.getLong(COLUNA_ID);
				String nome = fornecedorObtido.getString(COLUNA_NOME);
				String cnpj = fornecedorObtido.getString(COLUNA_CNPJ);
				String nomeFantasia = fornecedorObtido
						.getString(COLUNA_NOME_FANTASIA);

				f = new Fornecedor();
				f.setId(id);
				f.setNome(nome);
				f.setCnpj(cnpj);
				f.setNomeFantasia(nomeFantasia);
			} else {
				Mensagem.exibirMensagem("Nenhum registro foi encontrado.");
			}
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}

		return f;
	}

	public List<Fornecedor> pesquisar(Fornecedor fornecedor) {
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

		String sql = "";

		Long id = fornecedor.getId();
		String nome = fornecedor.getNome();
		String nomeFantasia = fornecedor.getNomeFantasia();
		String cnpj = fornecedor.getCnpj();

		sql += COMANDO_BASE;

		if (fornecedor != null) {
			sql += CONDICIONAL_WHERE;
		}

		if (nome != null && !nome.isEmpty()) {
			sql += " nome = '" + nome + "'";
		} else if (cnpj != null && !cnpj.isEmpty()) {
			sql += " cnpj = '" + cnpj + "'";
		} else if (nomeFantasia != null && !nomeFantasia.isEmpty()) {
			sql += " telefone = '" + nomeFantasia + "'";
		}

		Fornecedor f = null;
		try {
			comando = conexaoSisProjeto.prepareStatement(sql);

			ResultSet clienteObtido = comando.executeQuery();

			while (clienteObtido.next()) {
				id = clienteObtido.getLong(COLUNA_ID);
				nome = clienteObtido.getString(COLUNA_NOME);
				cnpj = clienteObtido.getString(COLUNA_CNPJ);
				nomeFantasia = clienteObtido.getString(COLUNA_NOME_FANTASIA);

				f = new Fornecedor();

				f.setId(id);
				f.setNome(nome);
				f.setCnpj(cnpj);
				f.setNomeFantasia(nomeFantasia);

				fornecedores.add(f);
			}
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}

		return fornecedores;
	}

}

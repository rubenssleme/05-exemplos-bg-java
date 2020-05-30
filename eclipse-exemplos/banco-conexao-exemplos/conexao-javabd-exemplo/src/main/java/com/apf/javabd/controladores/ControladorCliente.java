package com.apf.javabd.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.apf.javabd.dominio.Cliente;
import com.apf.javabd.repositorios.RepositorioCliente;
import com.apf.javabd.utilitarios.Mensagem;

public class ControladorCliente {

	private JTextField jtfId;
	private JTextField jtfNome;
	private JTextField jtfCnpj;
	private JTextField jtfRazaoSocial;
	private JTextField jtfEmail;
	private JTextField jtfTelefone;
	private Cliente cliente;

	private JTable jtaTabela;
	private DefaultTableModel modeloTabela;

	public ControladorCliente(JTextField jtfId, JTextField jtfNome,
			JTextField jtfCnpj, JTextField jtfRazaoSocial, JTextField jtfEmail,
			JTextField jtfTelefone, JTable jtaCliente) {
		repositorioCliente = new RepositorioCliente();
		this.jtfId = jtfId;
		this.jtfNome = jtfNome;
		this.jtfCnpj = jtfCnpj;
		this.jtfRazaoSocial = jtfRazaoSocial;
		this.jtfEmail = jtfEmail;
		this.jtfTelefone = jtfTelefone;
		this.jtaTabela = jtaCliente;
	}

	private RepositorioCliente repositorioCliente;

	public Cliente inicializarObjeto(Cliente cliente) {
		cliente.setNome(jtfNome.getText());
		cliente.setCnpj(jtfCnpj.getText());
		cliente.setRazaoSocial(jtfRazaoSocial.getText());
		cliente.setEmail(jtfEmail.getText());
		cliente.setTelefone(jtfTelefone.getText());

		return cliente;
	}

	public void obterTodos() {
		List<Object[]> clientesObjetos = new ArrayList<Object[]>();
		List<Cliente> clientes = repositorioCliente.obterTodos();

		for (Cliente cliente : clientes) {
			Object[] clienteObjeto = obterCliente(cliente);
			clientesObjetos.add(clienteObjeto);
		}

		carregarTabela(clientesObjetos);

	}

	public void excluir() {
		if (repositorioCliente.obterPorId(new Long(jtfId.getText())) != null) {
			int resposta = Integer
					.parseInt(Mensagem
							.exibirPergunta("Deseja realmente excluir o cliente? 1 - Sim 2 - Nao"));
			if (resposta == 1) {
				if (repositorioCliente.excluir(new Long(jtfId.getText()))) {
					Mensagem.exibirMensagem("Cliente foi excluído com sucesso.");
				} else {
					Mensagem.exibirMensagem("Falha ao excluir o cliente.");
				}
			}
		}

	}

	public void salvar() {
		cliente = new Cliente();

		cliente = inicializarObjeto(cliente);

		if (repositorioCliente.salvar(cliente)) {
			Mensagem.exibirMensagem("Cliente " + cliente.toString()
					+ " foi salvo com sucesso.");
		} else {
			Mensagem.exibirMensagem("Falha ao salvar o cliente "
					+ cliente.toString() + ".");
		}
	}

	public void obterPorId() {
		cliente = new Cliente();

		Cliente clienteObtido = null;
		if (possuiId()) {
			cliente.setId(new Long(jtfId.getText()));
			clienteObtido = repositorioCliente.obterPorId(cliente.getId());
		}

		if (clienteObtido != null) {
			jtfId.setText(clienteObtido.getId().toString());
			jtfNome.setText(clienteObtido.getNome());
			jtfCnpj.setText(clienteObtido.getCnpj());
			jtfRazaoSocial.setText(clienteObtido.getRazaoSocial());
			jtfEmail.setText(clienteObtido.getEmail());
			jtfTelefone.setText(clienteObtido.getTelefone());
		}
	}

	public void alterar() {
		cliente = new Cliente();
		cliente = inicializarObjeto(cliente);
		cliente.setId(new Long(jtfId.getText()));

		if (repositorioCliente.obterPorId(cliente.getId()) != null) {
			if (repositorioCliente.alterar(cliente)) {
				Mensagem.exibirMensagem("Cliente " + cliente.toString()
						+ " foi alterado com sucesso.");
			} else {
				Mensagem.exibirMensagem("Falha ao alterar o cliente "
						+ cliente.toString() + ".");
			}
		}
	}

	public void pesquisar() {
		cliente = new Cliente();
		cliente = inicializarObjeto(cliente);

		List<Cliente> clientesObtidos = new ArrayList<Cliente>();
		if (possuiId()) {
			cliente.setId(new Long(jtfId.getText()));
			clientesObtidos.add(repositorioCliente.obterPorId(cliente.getId()));
		} else {
			clientesObtidos = repositorioCliente.pesquisar(cliente);
		}

		List<Object[]> clientesObjetos = new ArrayList<Object[]>();

		for (Cliente cliente : clientesObtidos) {
			Object[] clienteObjeto = obterCliente(cliente);
			clientesObjetos.add(clienteObjeto);
		}

		carregarTabela(clientesObjetos);

		limparCampos();
	}

	public void inicializarModelo() {
		if (!possuiModeloTabela()) {
			modeloTabela = (DefaultTableModel) jtaTabela.getModel();
		}
	}

	public Object[] obterCliente(Cliente cliente) {
		Object[] clientes = new Object[] { cliente.getId(), cliente.getNome(),
				cliente.getCnpj(), cliente.getRazaoSocial(),
				cliente.getEmail(), cliente.getTelefone() };

		return clientes;
	}

	public void limparTabela() {
		modeloTabela.setRowCount(0);
	}

	public void carregarTabela(Object[] dados) {
		limparTabela();
		jtaTabela.revalidate();
		modeloTabela.addRow(dados);
		modeloTabela.fireTableDataChanged();
	}

	public void carregarTabela(List<Object[]> dados) {
		limparTabela();
		jtaTabela.revalidate();
		for (Object[] dado : dados) {
			modeloTabela.addRow(dado);
		}
		modeloTabela.fireTableDataChanged();
	}

	public void limparCampos() {
		jtfId.setText("");
		jtfNome.setText("");
		jtfCnpj.setText("");
		jtfRazaoSocial.setText("");
		jtfEmail.setText("");
		jtfTelefone.setText("");
	}

	private boolean possuiId() {
		return jtfId.getText() != null && !jtfId.getText().isEmpty();
	}

	private boolean possuiModeloTabela() {
		return modeloTabela != null;
	}

}

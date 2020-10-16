package com.apf.javabd.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.apf.javabd.dominio.Fornecedor;
import com.apf.javabd.repositorios.RepositorioFornecedor;
import com.apf.javabd.utilitarios.Mensagem;

public class ControladorFornecedor {

	private JTextField jtfId;
	private JTextField jtfNome;
	private JTextField jtfCnpj;
	private JTextField jtfNomeFantasia;
	private Fornecedor fornecedor;

	private JTable jtaFornecedor;
	private DefaultTableModel modeloTabela;

	private RepositorioFornecedor repositorioFornecedor;

	public ControladorFornecedor(JTextField jtfId, JTextField jtfNome,
			JTextField jtfCnpj, JTextField jtfNomeFantasia, JTable jtaFornecedor) {
		repositorioFornecedor = new RepositorioFornecedor();
		this.jtfId = jtfId;
		this.jtfNome = jtfNome;
		this.jtfNomeFantasia = jtfNomeFantasia;
		this.jtfCnpj = jtfCnpj;
		this.jtaFornecedor = jtaFornecedor;
	}

	public Fornecedor inicializarObjeto(Fornecedor fornecedor) {
		fornecedor.setNome(jtfNome.getText());
		fornecedor.setCnpj(jtfCnpj.getText());
		fornecedor.setNomeFantasia(jtfNomeFantasia.getText());

		return fornecedor;
	}

	public void obterTodos() {
		List<Object[]> fornecedoresObjetos = new ArrayList<Object[]>();
		List<Fornecedor> fornecedores = repositorioFornecedor.obterTodos();

		for (Fornecedor fornecedor : fornecedores) {
			Object[] clienteObjeto = obterFornecedor(fornecedor);
			fornecedoresObjetos.add(clienteObjeto);
		}

		carregarTabela(fornecedoresObjetos);

	}

	public void excluir() {
		if (repositorioFornecedor.obterPorId(new Long(jtfId.getText())) != null) {
			int resposta = Integer
					.parseInt(Mensagem
							.exibirPergunta("Deseja realmente excluir o fornecedor? 1 - Sim 2 - Nao"));
			if (resposta == 1) {
				if (repositorioFornecedor.excluir(new Long(jtfId.getText()))) {
					Mensagem.exibirMensagem("Fornecedor foi excluído com sucesso.");
				} else {
					Mensagem.exibirMensagem("Falha ao excluir o fornecedor.");
				}

			}
		}
	}

	public void salvar() {
		fornecedor = new Fornecedor();

		fornecedor = inicializarObjeto(fornecedor);

		if (repositorioFornecedor.salvar(fornecedor)) {
			Mensagem.exibirMensagem("Fornecedor " + fornecedor.toString()
					+ " foi salvo com sucesso.");
		} else {
			Mensagem.exibirMensagem("Falha ao salvar o fornecedor "
					+ fornecedor.toString() + ".");
		}
	}

	public void obterPorId() {
		fornecedor = new Fornecedor();

		Fornecedor fornecedorObtido = null;
		if (possuiId()) {
			fornecedor.setId(new Long(jtfId.getText()));
			fornecedorObtido = repositorioFornecedor.obterPorId(fornecedor
					.getId());
		}

		if (fornecedorObtido != null) {
			jtfId.setText(fornecedorObtido.getId().toString());
			jtfNome.setText(fornecedorObtido.getNome());
			jtfCnpj.setText(fornecedorObtido.getCnpj());
			jtfNomeFantasia.setText(fornecedorObtido.getNomeFantasia());
		}
	}

	public void alterar() {
		fornecedor = new Fornecedor();
		fornecedor = inicializarObjeto(fornecedor);
		fornecedor.setId(new Long(jtfId.getText()));

		if (repositorioFornecedor.obterPorId(fornecedor.getId()) != null) {
			if (repositorioFornecedor.alterar(fornecedor)) {
				Mensagem.exibirMensagem("Fornecedor " + fornecedor.toString()
						+ " foi alterado com sucesso.");
			} else {
				Mensagem.exibirMensagem("Falha ao alterar o fornecedor "
						+ fornecedor.toString() + ".");
			}
		}
	}

	public void pesquisar() {
		fornecedor = new Fornecedor();
		fornecedor = inicializarObjeto(fornecedor);

		List<Fornecedor> fornecedoresObtidos = new ArrayList<Fornecedor>();
		if (possuiId()) {
			fornecedor.setId(new Long(jtfId.getText()));
			fornecedoresObtidos.add(repositorioFornecedor.obterPorId(fornecedor
					.getId()));
		} else {
			fornecedoresObtidos = repositorioFornecedor.pesquisar(fornecedor);
		}

		List<Object[]> fornecedoresObjetos = new ArrayList<Object[]>();

		for (Fornecedor fornecedor : fornecedoresObtidos) {
			Object[] fornecedorObjeto = obterFornecedor(fornecedor);
			fornecedoresObjetos.add(fornecedorObjeto);
		}

		carregarTabela(fornecedoresObjetos);

		limparCampos();
	}

	public void inicializarModelo() {
		if (!possuiModeloTabela()) {
			modeloTabela = (DefaultTableModel) jtaFornecedor.getModel();
		}
	}

	public Object[] obterFornecedor(Fornecedor fornecedor) {
		Object[] fornecedores = new Object[] { fornecedor.getId(),
				fornecedor.getNome(), fornecedor.getCnpj(),
				fornecedor.getNomeFantasia() };

		return fornecedores;
	}

	public void limparTabela() {
		modeloTabela.setRowCount(0);
	}

	public void carregarTabela(Object[] dados) {
		limparTabela();
		jtaFornecedor.revalidate();
		modeloTabela.addRow(dados);
		modeloTabela.fireTableDataChanged();
	}

	public void carregarTabela(List<Object[]> dados) {
		limparTabela();
		jtaFornecedor.revalidate();
		for (Object[] dado : dados) {
			modeloTabela.addRow(dado);
		}
		modeloTabela.fireTableDataChanged();
	}

	public void limparCampos() {
		jtfId.setText("");
		jtfNome.setText("");
		jtfCnpj.setText("");
		jtfNomeFantasia.setText("");
	}

	private boolean possuiId() {
		return jtfId.getText() != null && !jtfId.getText().isEmpty();
	}

	private boolean possuiModeloTabela() {
		return modeloTabela != null;
	}
}

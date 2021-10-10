package br.com.conexao.control;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import br.com.conexao.model.Produto;

@SuppressWarnings("serial")
public class ControladorTelaMostraProduto extends ControladorTelaPesquisar {
	private static final int LARGURA_COLUNA_ID = 200;
	private static final int LARGURA_COLUNA_NOME = 800;
	private static final int LARGURA_COLUNA_PRECO = 200;
	private static final int LARGURA_COLUNA_CATEGORIA = 200;

	JFrame telapai;

	public ControladorTelaMostraProduto(JFrame telapai, JTable jta) {
		super(telapai, jta, new Object[] { "ID", "Nome", "Categoria", "Preço" });
		this.telapai = telapai;
		this.jta = jta;
		inicializarComponentes();
		configurarTela("Mostra Produtos", 600, 600, null, false, true, 1);
		carregarProdutos();
		definirLarguraColuna();
		colunaRedimensionavel(false);
		alinharTexto();
	}

	public void carregarProdutos() {
		List<Produto> produtos = new ArrayList<Produto>();
		ControladorProduto controlador = new ControladorProduto();

		produtos = controlador.listarTudo();
		for (int i = 0; i < produtos.size(); i++) {
			modeloTabela.addRow(new Object[] { produtos.get(i).getId(),
					produtos.get(i).getNome(), produtos.get(i).getCategoria() ,produtos.get(i).getPreco() });
		}

	}

	public void definirLarguraColuna() {
		jta.getTableHeader().getColumnModel().getColumn(0)
				.setMaxWidth(LARGURA_COLUNA_ID);
		jta.getTableHeader().getColumnModel().getColumn(1)
				.setMaxWidth(LARGURA_COLUNA_NOME);
		jta.getTableHeader().getColumnModel().getColumn(2)
		.setMaxWidth(LARGURA_COLUNA_CATEGORIA);
		jta.getTableHeader().getColumnModel().getColumn(3)
				.setMaxWidth(LARGURA_COLUNA_PRECO);
	}

	public void colunaRedimensionavel(boolean verdadeiro_falso) {
		jta.getTableHeader().setResizingAllowed(verdadeiro_falso);
	}

	public void alinharTexto() {
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		for (int i = 0; i < jta.getColumnCount(); i++) {
			rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
			jta.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
		}
	}
}

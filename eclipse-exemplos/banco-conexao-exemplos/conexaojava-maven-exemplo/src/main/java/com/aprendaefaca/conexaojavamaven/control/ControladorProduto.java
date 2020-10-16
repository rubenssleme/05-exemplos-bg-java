package com.aprendaefaca.conexaojavamaven.control;

import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.aprendaefaca.conexaojavamaven.model.Produto;
import com.aprendaefaca.conexaojavamaven.persistence.ConexaoBD;

public class ControladorProduto extends ConexaoBD {
	private static final String NOME_TABELA = "tbProdutos";

	private static final String COLUNA_ID = "ID";
	private static final String COLUNA_NOME = "NOME";
	private static final String COLUNA_PRECO = "PRECO";
	private static final String COLUNA_CATEGORIA = "CATEGORIA";

	private static final String MENSAGEM_INSERIDO_COM_SUCESSO = "Inserido com sucesso";
	private static final String MENSAGEM_EXCLUIDO_COM_SUCESSO = "Exclu�do com sucesso";
	private static final String MENSAGEM_ALTERADO_COM_SUCESSO = "Alterado com sucesso";

	private static final String MENSAGEM_PRODUTO_NAO_ENCONTRADO = "Nenhum produto encontrado.\n";
	private static final String MENSAGEM_FALHA_AO_EXCLUIR = "Falha ao excluir";
	private static final String MENSAGEM_FALHA_AO_ALTERAR = "Falha ao alterar";
	private static final String MENSAGEM_FALHA_AO_INSERIR_COM_DETALHES_DO_ERRO = "Falha ao inserir.\nDetalhes do erro: ";

	private static final String MENSAGEM_LISTA_DE_PRODUTOS = "Lista de Produtos\n";

	private static final String MENSAGEM_FECHA_PARENTESES = ")";
	private static final String MENSAGEM_COLUNA_ID = COLUNA_ID + ": ";
	private static final String MENSAGEM_COLUNA_NOME = COLUNA_NOME + ": ";
	private static final String MENSAGEM_COLUNA_PRECO = COLUNA_PRECO + ": ";
	private static final String MENSAGEM_COLUNA_CATEGORIA = COLUNA_CATEGORIA
			+ ": ";

	private static final String MENSAGEM_FORMATO_INVALIDO = "Formato de n�mero inv�lido";

	private static final String COMANDO_CLAUSULA_ORDER_BY = " ORDER BY ";
	private static final String COMANDO_CLAUSULA_ID = " WHERE id = ";
	private static final String COMANDO_CLAUSULA_PRECO = "', preco = ";

	private static final String COMANDO_LISTAR_TUDO = "SELECT * FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_ORDER_BY + COLUNA_ID;

	private static final String COMANDO_BUSCAR_POR_ID = "SELECT * FROM \"tbProdutos\""
			+ COMANDO_CLAUSULA_ID;

	private static final String COMANDO_INSERIR_PRODUTO = "INSERT INTO \""
			+ NOME_TABELA + "\"" + "(" + COLUNA_NOME + "," + COLUNA_CATEGORIA
			+ "," + COLUNA_PRECO + ") VALUES ('";

	private static final String COMANDO_EXCLUIR_PRODUTO = "DELETE FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_ID;

	private static final String COMANDO_ALTERAR_PRODUTO = "UPDATE \""
			+ NOME_TABELA + "\" set nome = '";

	private static final String COMANDO_BUSCAR_ULTIMO_ID_CADASTRADO = "SELECT max(id) FROM \"tbProdutos\"";

	public void salvar(Produto produto) throws SQLException {
		conectar();

		try {
			getStatement().executeUpdate(
					COMANDO_INSERIR_PRODUTO
							+ produto.getNome()
							+ "','"
							+ produto.getCategoria()
							+ "',"
							+ produto.getPreco().setScale(2,
									RoundingMode.HALF_EVEN)
							+ MENSAGEM_FECHA_PARENTESES);
			ResultSet rs = getStatement().executeQuery(
					COMANDO_BUSCAR_ULTIMO_ID_CADASTRADO);
			if (rs.next()) {
				produto.setId(rs.getInt(1));
			}
			JOptionPane.showMessageDialog(
					null,
					MENSAGEM_COLUNA_ID + produto.getId() + "\n"
							+ MENSAGEM_COLUNA_NOME + produto.getNome() + "\n"
							+ MENSAGEM_COLUNA_PRECO + produto.getPreco() + "\n"
							+ MENSAGEM_COLUNA_CATEGORIA
							+ produto.getCategoria() + "\n"
							+ MENSAGEM_INSERIDO_COM_SUCESSO);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null,
					MENSAGEM_FALHA_AO_INSERIR_COM_DETALHES_DO_ERRO + ex);
		}
		desconectar();
	}

	public void excluir(int id) {
		conectar();
		try {
			int rs = getStatement().executeUpdate(COMANDO_EXCLUIR_PRODUTO + id);
			if (rs != 0) {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_EXCLUIDO_COM_SUCESSO);
			} else {
				JOptionPane.showMessageDialog(null, MENSAGEM_FALHA_AO_EXCLUIR
						+ "\n" + MENSAGEM_PRODUTO_NAO_ENCONTRADO);
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, MENSAGEM_FALHA_AO_EXCLUIR
					+ "\nDetalhes: " + ex);
		}

		desconectar();
	}

	public void alterar(Produto produto) throws SQLException {
		conectar();
		int retorno = 0;
		try {
			retorno = getStatement().executeUpdate(
					COMANDO_ALTERAR_PRODUTO
							+ produto.getNome()
							+ "', categoria = '"
							+ produto.getCategoria()
							+ COMANDO_CLAUSULA_PRECO
							+ produto.getPreco().setScale(2,
									RoundingMode.HALF_EVEN)
							+ COMANDO_CLAUSULA_ID + produto.getId());
			if (retorno != 0) {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_ALTERADO_COM_SUCESSO);

			} else {
				JOptionPane.showMessageDialog(null, MENSAGEM_FALHA_AO_ALTERAR
						+ "\n" + MENSAGEM_PRODUTO_NAO_ENCONTRADO);
			}
			desconectar();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, MENSAGEM_FORMATO_INVALIDO);
		}
	}

	public Produto consultar(int id) throws SQLException {
		ResultSet rs;
		Produto produto = new Produto();
		conectar();

		rs = getStatement().executeQuery(COMANDO_BUSCAR_POR_ID + id);
		if (rs.next() && !(rs.wasNull())) {
			produto.setId(rs.getLong("id"));
			produto.setNome(rs.getString("nome"));
			produto.setPreco(rs.getBigDecimal("preco"));
			produto.setCategoria(rs.getString("categoria"));
			JOptionPane.showMessageDialog(null, MENSAGEM_LISTA_DE_PRODUTOS
					+ MENSAGEM_COLUNA_ID + produto.getId() + "\n"
					+ MENSAGEM_COLUNA_NOME + produto.getNome() + "\n"
					+ MENSAGEM_COLUNA_CATEGORIA + produto.getCategoria() + "\n"
					+ MENSAGEM_COLUNA_PRECO + produto.getPreco());
		} else {
			System.out.println(MENSAGEM_PRODUTO_NAO_ENCONTRADO);
		}

		desconectar();
		return produto;
	}

	public List<Produto> listarTudo() {
		List<Produto> listaProdutos = new ArrayList<Produto>();
		ResultSet rs;
		conectar();
		try {
			rs = getStatement().executeQuery(COMANDO_LISTAR_TUDO);
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(Integer.parseInt(rs.getString("id")));
				produto.setNome(rs.getString("nome"));
				produto.setPreco(rs.getBigDecimal("preco"));
				produto.setCategoria(rs.getString("categoria"));
				listaProdutos.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return listaProdutos;
	}
}

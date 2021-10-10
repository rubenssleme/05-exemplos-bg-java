package com.aprendaefaca.conexaojavamaven.control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.aprendaefaca.conexaojavamaven.model.Usuario;
import com.aprendaefaca.conexaojavamaven.persistence.ConexaoBD;
import com.aprendaefaca.conexaojavamaven.utilitarios.Criptografia;

public class ControladorUsuario extends ConexaoBD {
	private static final String NOME_TABELA = "tbLogin";

	private static final String COLUNA_ID = " id ";
	private static final String COLUNA_USUARIO = " usuario ";
	private static final String COLUNA_SENHA = " senha ";

	private static final String MENSAGEM_INSERIDO_COM_SUCESSO = "Inserido com sucesso\n";
	private static final String MENSAGEM_EXCLUIDO_COM_SUCESSO = "Excluido com sucesso\n";
	private static final String MENSAGEM_ALTERADO_COM_SUCESSO = "Alterado com sucesso\n";
	private static final String MENSAGEM_AUTENTICADO_COM_SUCESSO = "Autenticado com sucesso.\n";

	private static final String MENSAGEM_USUARIO_JA_EXISTENTE = "Usuario ja existente. Informe outro usuario.\n";
	private static final String MENSAGEM_USUARIO_OU_SENHA_INVALIDA = "Usuario ou senha invalido.\n";
	private static final String MENSAGEM_FALHA_AO_EXCLUIR = "Falha ao excluir\n";
	private static final String MENSAGEM_FALHA_AO_ALTERAR = "Falha ao alterar\n";
	private static final String MENSAGEM_FALHA_AO_INSERIR_COM_DETALHES_DO_ERRO = "Falha ao inserir.\nDetalhes do erro: ";

	private static final String MENSAGEM_LISTA_DE_USUARIOS = "Lista de Usuarios\n";

	private static final String MENSAGEM_FECHA_PARENTESES = ")";
	private static final String MENSAGEM_COLUNA_ID = COLUNA_ID + ": ";
	private static final String MENSAGEM_COLUNA_USUARIO = COLUNA_USUARIO + ": ";
	private static final String MENSAGEM_COLUNA_SENHA = COLUNA_SENHA + ": ";

	private static final String MENSAGEM_FORMATO_INVALIDO = "Formato de numero invalido";

	private static final String COMANDO_CLAUSULA_SENHA_AND = "' AND senha ='";
	private static final String COMANDO_CLAUSULA_ORDER_BY = " ORDER BY ";
	private static final String COMANDO_CLAUSULA_ID = " WHERE id = ";
	private static final String COMANDO_CLAUSULA_USUARIO = " WHERE usuario = '";
	private static final String COMANDO_CLAUSULA_SENHA = "', " + COLUNA_SENHA
			+ " = ";

	private static final String COMANDO_AUTENTICAR_LOGIN = "SELECT * FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_USUARIO;
	private static final String COMANDO_LISTAR_TUDO = "SELECT * FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_ORDER_BY + COLUNA_ID;

	private static final String COMANDO_BUSCAR_POR_ID = "SELECT * FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_ID;
	
	private static final String COMANDO_BUSCAR_POR_NOME = "SELECT * FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_USUARIO;

	private static final String COMANDO_INSERIR_USUARIO = "INSERT INTO \""
			+ NOME_TABELA + "\"" + "(" + COLUNA_USUARIO + "," + COLUNA_SENHA
			+ ") VALUES ('";

	private static final String COMANDO_EXCLUIR_USUARIO = "DELETE FROM \""
			+ NOME_TABELA + "\"" + COMANDO_CLAUSULA_ID;

	private static final String COMANDO_ALTERAR_USUARIO = "UPDATE \""
			+ NOME_TABELA + "\"set nome = '";

	private static final String COMANDO_BUSCAR_ULTIMO_ID_CADASTRADO = "SELECT max(id) FROM \""
			+ NOME_TABELA + "\"";

	public void salvar(Usuario usuario) throws SQLException {
		conectar();
		boolean ret;
		
		try {
			ret = verificarUsuarioExistente(usuario.getUsuario());

			if (!ret) {
				getStatement().executeUpdate(
						COMANDO_INSERIR_USUARIO + usuario.getUsuario() + "','"
								+ Criptografia.criptografar(usuario.getSenha())
								+ "'" + MENSAGEM_FECHA_PARENTESES);
				ResultSet rs = getStatement().executeQuery(
						COMANDO_BUSCAR_ULTIMO_ID_CADASTRADO);
				if (rs.next()) {
					usuario.setId(rs.getInt(1));
				}
				JOptionPane.showMessageDialog(null, MENSAGEM_COLUNA_ID
						+ usuario.getId() + "\n" + MENSAGEM_COLUNA_USUARIO
						+ usuario.getUsuario() + "\n"
						+ MENSAGEM_INSERIDO_COM_SUCESSO);
			} else {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_USUARIO_JA_EXISTENTE);
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null,
					MENSAGEM_FALHA_AO_INSERIR_COM_DETALHES_DO_ERRO + ex);
		}
		desconectar();
	}

	public void excluir(int id) {
		conectar();
		try {
			int rs = getStatement().executeUpdate(COMANDO_EXCLUIR_USUARIO + id);
			if (rs != 0) {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_EXCLUIDO_COM_SUCESSO);
			} else {
				JOptionPane.showMessageDialog(null, MENSAGEM_FALHA_AO_EXCLUIR
						+ "\n" + MENSAGEM_USUARIO_OU_SENHA_INVALIDA);
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, MENSAGEM_FALHA_AO_EXCLUIR
					+ "\nDetalhes: " + ex);
		}

		desconectar();
	}

	public void alterar(Usuario usuario) throws SQLException {
		conectar();
		int retorno = 0;
		try {
			retorno = getStatement().executeUpdate(
					COMANDO_ALTERAR_USUARIO + usuario.getUsuario()
							+ COMANDO_CLAUSULA_SENHA
							+ Criptografia.criptografar(usuario.getSenha())
							+ COMANDO_CLAUSULA_ID + usuario.getId());
			if (retorno != 0) {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_ALTERADO_COM_SUCESSO);

			} else {
				JOptionPane.showMessageDialog(null, MENSAGEM_FALHA_AO_ALTERAR
						+ "\n" + MENSAGEM_USUARIO_OU_SENHA_INVALIDA);
			}
			desconectar();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, MENSAGEM_FORMATO_INVALIDO);
		}
	}

	public Usuario consultar(int id) throws SQLException {
		ResultSet rs;
		Usuario usuario = new Usuario();
		conectar();

		rs = getStatement().executeQuery(COMANDO_BUSCAR_POR_ID + id);
		if (rs.next() && !(rs.wasNull())) {
			usuario.setId(rs.getLong(1));
			usuario.setUsuario(rs.getString(2));
			usuario.setSenha(rs.getString(3));
			JOptionPane.showMessageDialog(null, MENSAGEM_LISTA_DE_USUARIOS
					+ MENSAGEM_COLUNA_ID + usuario.getId() + "\n"
					+ MENSAGEM_COLUNA_USUARIO + usuario.getUsuario() + "\n"
					+ MENSAGEM_COLUNA_SENHA + usuario.getSenha());
		} else {
			System.out.println(MENSAGEM_USUARIO_OU_SENHA_INVALIDA);
		}

		desconectar();
		return usuario;
	}
	
	public Usuario consultar(String nome) throws SQLException {
		ResultSet rs;
		Usuario usuario = new Usuario();
		conectar();

		rs = getStatement().executeQuery(COMANDO_BUSCAR_POR_NOME + nome);
		if (rs.next() && !(rs.wasNull())) {
			usuario.setId(rs.getLong(1));
			usuario.setUsuario(rs.getString(2));
			usuario.setSenha(rs.getString(3));
			JOptionPane.showMessageDialog(null, MENSAGEM_LISTA_DE_USUARIOS
					+ MENSAGEM_COLUNA_ID + usuario.getId() + "\n"
					+ MENSAGEM_COLUNA_USUARIO + usuario.getUsuario() + "\n"
					+ MENSAGEM_COLUNA_SENHA + usuario.getSenha());
		} else {
			System.out.println(MENSAGEM_USUARIO_OU_SENHA_INVALIDA);
		}

		desconectar();
		return usuario;
	}

	public List<Usuario> listarTudo() {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		ResultSet rs;
		conectar();
		try {
			rs = getStatement().executeQuery(COMANDO_LISTAR_TUDO);
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(Integer.parseInt(rs.getString(1)));
				usuario.setUsuario(rs.getString(2));
				usuario.setSenha(rs.getString(3));
				listaUsuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return listaUsuarios;
	}

	public boolean autenticarUsuario(String usuario, String senha) {
		ResultSet rs;
		boolean ret = false;

		conectar();

		try {
			rs = getStatement()
					.executeQuery(
							COMANDO_AUTENTICAR_LOGIN
									+ usuario
									+ COMANDO_CLAUSULA_SENHA_AND
									+ Criptografia.criptografar(senha
											.toString()) + "'");
			if (rs.next() && !(rs.wasNull())) {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_AUTENTICADO_COM_SUCESSO);
				ret = true;
			} else {
				JOptionPane.showMessageDialog(null,
						MENSAGEM_USUARIO_OU_SENHA_INVALIDA);
				ret = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			desconectar();
		}
		return ret;
	}
	
	public boolean verificarUsuarioExistente(String usuario) {
		ResultSet rs;
		boolean ret = false;
		try {
			rs = getStatement()
					.executeQuery(COMANDO_BUSCAR_POR_NOME +  usuario + "'");
			if (rs.next() && !(rs.wasNull())) {				
				ret = true;
			} else {				
				ret = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
}

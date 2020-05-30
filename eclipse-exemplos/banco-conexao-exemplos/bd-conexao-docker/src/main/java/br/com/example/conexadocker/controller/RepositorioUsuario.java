package br.com.example.conexadocker.controller;

import br.com.example.conexadocker.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public class RepositorioUsuario extends RepositorioBase implements IRepositorioBase<Usuario> {


	private static final String COMANDO_BASE = "SELECT * FROM tb_usuario";
	private static final String COLUNA_ID = "id";
	private static final String COLUNA_NOME = "nome";
	private static final String COLUNA_EMAIL = "eMail";
	private static final String COLUNA_TIPO = "tipo";
	private static final String COLUNA_LOGIN = "login";
	private static final String COLUNA_SENHA = "senha";

	public boolean salvar(Usuario usuario) {
		if (usuario != null) {
			//Exibir o valor do objeto Usuario
			//JOptionPane.showMessageDialog(null,usuario.toString());
			System.out.println(usuario.toString());
			return true;
		} else {
			return false;
		}

	}

	public boolean inclui(Usuario usuario) {
		boolean salvo = false;
		String nome = usuario.getNome();
		String eMail = usuario.getEmail();
		String tipo = usuario.getTipo();
		String login = usuario.getLogin();
		String senha = usuario.getSenha();

		try {
			preparedStatement = connection.prepareStatement("INSERT INTO USUARIO ("
					+ COLUNA_NOME + "," + COLUNA_EMAIL + "," + COLUNA_TIPO + "," + COLUNA_LOGIN + ","
					+ COLUNA_SENHA + " )VALUES ('" + nome + "','" + eMail + "','" + tipo + "','"
					+ login + "','" + senha + "' )");
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao salvar no banco de dados: " + e.toString());
		}
		return salvo;
	}







	public boolean altera(Usuario entidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean excluir(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Usuario> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario obterPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}

package com.aprendaefaca.conexaojavamaven.persistence;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD extends Conexao {

	public ConexaoBD() {
		inicializarBancoDeDados();
		conectar();
	}

	// M�todos
	public void configurarUsuario(String usuario, String senha) {
		setUsuario(usuario);
		setSenha(senha);
	}

	public void configurarLocal(String banco) {
		setLocal(banco);
	}

	public void conectar() {
		try {
			Class.forName(getDriverjdbc());
			setConnection(DriverManager.getConnection(getConnectionString(),
					getUsuario(), getSenha()));
			setStatement(getConnection().createStatement());

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public void desconectar() {
		try {
			getConnection().close();
		} catch (SQLException ex) {
			System.err.println(ex);
			ex.printStackTrace();
		}
	}

	public void checarConexaoBD() {
		System.out.println("Estado de Conex�o: ");
		System.out.println(getConnection() != null ? "Conectado"
				: "Desconectado");
	}

}

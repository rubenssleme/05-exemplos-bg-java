package com.aprendaefaca.livrariadigital.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**/
public class Conexao {
	private String host = "localhost";
	private String bancodedados = "livrariadigital";
	private String usuario = "postgres";
        //private String usuario = "sa";
	private String senha = "123456";
	private String url = "jdbc:postgresql://" + host + "/" + bancodedados;
        //private String url = "jdbc:postgresql://" + host + "/" + bancodedados;
	private String driver = "org.postgresql.Driver";
       // private String driver = "org.postgresql.Driver";

	private static Connection conexaoLivrariaDigital;

	private boolean possuiConexao() {
		return conexaoLivrariaDigital != null;
	}

	private void inicializar() {
		if (!possuiConexao()) {
			conectar();
		}
	}

        
        
	public Connection obterConexaoLivrariaDigital() {
		inicializar();
		return conexaoLivrariaDigital;
	}

	public void encerrarConexao() {
		try {
			conexaoLivrariaDigital.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void conectar() {
		try {
			Class.forName(driver);
			conexaoLivrariaDigital = DriverManager
					.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

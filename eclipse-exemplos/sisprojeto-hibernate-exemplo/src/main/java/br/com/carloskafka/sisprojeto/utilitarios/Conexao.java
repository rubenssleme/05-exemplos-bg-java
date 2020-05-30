package br.com.carloskafka.sisprojeto.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**/
public class Conexao {
	private String host = "localhost";
	private String bancodedados = "sisprojeto";
	private String usuario = "postgres";
        //private String usuario = "sa";
	private String senha = "12345678";
	private String url = "jdbc:postgresql://" + host + "/" + bancodedados;
        //private String url = "jdbc:postgresql://" + host + "/" + bancodedados;
	private String driver = "org.postgresql.Driver";
       // private String driver = "org.postgresql.Driver";

	private static Connection conexaoSisProjeto;

	private boolean possuiConexao() {
		return conexaoSisProjeto != null;
	}

	private void inicializar() {
		if (!possuiConexao()) {
			conectar();
		}
	}

	public Connection obterConexaoSisProjeto() {
		inicializar();
		return conexaoSisProjeto;
	}

	public void encerrarConexao() {
		try {
			conexaoSisProjeto.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void conectar() {
		try {
			Class.forName(driver);
			conexaoSisProjeto = DriverManager
					.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

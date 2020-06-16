package br.com.example.conexadocker.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/teste";
	private String usuario = "root";
	private String senha = "root";
	private static Connection connection;


	private boolean possuiConexao(){
		return connection != null;
	}

	public void inicializar(){
		if(!possuiConexao()){
			conectar();	
		}
	}

	public Connection obterConexao(){
		inicializar();
		return connection;
	}

	public void encerrarConexao(){
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	private void conectar() {
		try{
			Class.forName(driver);
			connection = DriverManager.getConnection(url, usuario, senha);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	private Connection getConnection(){
		return connection;
	}
	public void testarConexao() {
		obterConexao();
		System.out.println("Estado de Conexao: ");
		System.out.println(getConnection() != null ? "Conectado"
				: "Desconectado");
	}

}

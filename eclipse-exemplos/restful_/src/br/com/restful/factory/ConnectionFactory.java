package br.com.restful.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * 
 * Classe respons�vel por conter os metodos criar e fechar o banco de dados.
 *
 *  
 * @author rubens.leme<rubenss.leme@gmail.com>
 * @since 16/04/2015
 * @version 1.0
 */
public class ConnectionFactory {

	// Caminho do banco de dados.
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USUARIO = "postgres";
	private static final String SENHA = "123456";


	/**
	 * 
	 * M�todo respons�vel por criar uma conexao com o banco 
	 *
	 * @return
	 * @author rubens.leme<rubenss.leme@gmail.com>
	 * @since 16/04/2015
	 * @version 1.0
	 */
	public Connection criarConexao(){

		Connection conexao = null;

		try {

			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

		} catch (Exception e) {
			System.out.println("Erro ao criar conex�o com o banco: " + URL);
			e.printStackTrace();
		}
		return conexao;
	}

/**
 * @author rubens.leme
 * @param conexao
 * @param pstmt
 * @param rs
 */
	public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs){

		try {

			if(conexao != null){
				conexao.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(rs != null){
				rs.close();
			}

		} catch (Exception e) {
			System.out.println("Erro ao fechar conex�o com o banco: " + URL);
		}
	}
}


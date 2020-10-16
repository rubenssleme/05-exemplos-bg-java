package persistencia;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String driver = "net.sourceforge.jtds.jdbc.Driver";
	private String url = "jdbc:jtds:sqlserver://localhost:1433/bdUsuario";
	private String usuario = "sa";
	private String senha = "1234567";
	private static Connection con;


	private boolean possuiConexao(){
		return con != null;
	}

	public void inicializar(){
		if(!possuiConexao()){
			conectar();	
		}
	}

	public Connection obterConexao(){
		inicializar();
		return con;
	}

	public void encerrarConexao(){
		try{
			con.close();

		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	private void conectar() {
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, senha);
		}catch(Exception e){
			e.printStackTrace();

		}

	}

}

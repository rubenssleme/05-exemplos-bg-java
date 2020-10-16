
package br.com.bg.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private String host = "localhost";
	private String bancodedados = "sisprojeto";
	private String usuario = "postgres";
	private String senha = "abcd1234";
	private String url = "jdbc:postgresql://" + host + "/" + bancodedados;
	private String driver = "org.postgresql.Driver";
    
    private static Connection conexaoBD;
    
    private boolean possuiConexao(){
        return conexaoBD != null;
    }
    private void inicializarConexao(){
        if(!possuiConexao()){
            
        }
    }
    
    public Connection obterConexaoBD(){
        inicializarConexao();
        return conexaoBD;
    }
    public void encerrarConexaoBD(){
        try{
           conexaoBD.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private void conectarBD(){
        try{
            Class.forName(driver);
            conexaoBD = DriverManager.getConnection(url,usuario,senha);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

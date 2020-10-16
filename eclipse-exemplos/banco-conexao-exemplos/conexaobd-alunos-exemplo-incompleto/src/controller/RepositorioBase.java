package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import persistencia.Conexao;

public  class RepositorioBase  {
	//Atributos
	protected Connection con;
	protected PreparedStatement comando;
	
	//
	
	
	//Construtores
	public RepositorioBase() {
		con = new Conexao().obterConexao();
		comando = null;
	}

	//Encerrar Comando
	public void encerrarComando(){
		try{
			comando.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	//Encerrar Conexao
	public void encerrarConexao(){
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	
	
	

	

}

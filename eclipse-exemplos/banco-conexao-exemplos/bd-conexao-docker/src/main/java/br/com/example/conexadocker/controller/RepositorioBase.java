package br.com.example.conexadocker.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.example.conexadocker.persistencia.Conexao;

public  class RepositorioBase  {
	//Atributos
	protected Connection connection;
	protected PreparedStatement preparedStatement;
	

	
	
	//Construtores
	public RepositorioBase() {
		connection = new Conexao().obterConexao();
		preparedStatement = null;
	}

	//Encerrar Comando
	public void encerrarComando(){
		try{
			preparedStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	//Encerrar Conexao
	public void encerrarConexao(){
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	
	
	

	

}

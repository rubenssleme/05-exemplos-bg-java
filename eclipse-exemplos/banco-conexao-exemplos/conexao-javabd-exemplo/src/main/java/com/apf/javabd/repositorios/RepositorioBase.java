package com.apf.javabd.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.apf.javabd.utilitarios.Conexao;
import java.util.List;

public class RepositorioBase<T> implements IRepositorioBase<T>{
	protected Connection conexaoSisProjeto;
	protected PreparedStatement comando;

	public RepositorioBase() {
		conexaoSisProjeto = new Conexao().obterConexaoSisProjeto();
		comando = null;
	}

	public void encerrarComando() {
		try {
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void encerrarConexao() {
		try {
			conexaoSisProjeto.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

    @Override
    public boolean salvar(T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> obterTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T obterPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}

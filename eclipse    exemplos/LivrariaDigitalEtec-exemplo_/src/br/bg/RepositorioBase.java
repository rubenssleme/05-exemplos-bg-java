package br.bg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.bg.Conexao;
import br.bg.Mensagem;

public abstract class RepositorioBase<T> implements IRepositorioBase<T> {
	protected Connection conexaoSisProjeto;
	protected PreparedStatement comando;
	
	protected String NENHUM_REGISTRO_ENCONTRADO = "Nenhum registro foi encontrado.";

	public RepositorioBase() {
		conexaoSisProjeto = new Conexao().obterConexaoProjLivrariaDigital();
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

	public boolean alterar(String sql) {
		boolean alterado = false;

		try {
			comando = conexaoSisProjeto.prepareStatement(sql);
			comando.executeUpdate();
			encerrarComando();
			alterado = true;
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
			alterado = false;
		}
		return alterado;
	}
        
        
        
        
        
        
        

	public boolean salvar(String sql) {
		boolean salvo = false;

		try {
			comando = conexaoSisProjeto.prepareStatement(sql);
			comando.executeUpdate();
			salvo = true;
			encerrarComando();
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
			salvo = false;
		}
		return salvo;
	}

        
        
	public boolean excluir(String sql) {
		boolean excluido = false;

		try {
			comando = conexaoSisProjeto.prepareStatement(sql);
			comando.executeUpdate();
			encerrarComando();
			excluido = true;
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		return excluido;
	}  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	public ResultSet obterPor(String sql) {
		ResultSet resultado = null;
		try {
			comando = conexaoSisProjeto.prepareStatement(sql);
			resultado = comando.executeQuery();
		} catch (SQLException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}

		return resultado;
	}

}

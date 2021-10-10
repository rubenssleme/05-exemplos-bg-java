
package br.com.bg.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.bg.persistencia.Conexao;
import java.sql.SQLException;
public class RepositorioBase {
    protected Connection conexaoBD;
    protected PreparedStatement comando;

    public RepositorioBase() {
        conexaoBD = new Conexao().obterConexaoBD();
        comando = null;
    }
    
    public void encerrarComando(){
        try{
            comando.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void encerrarConexao(){
        try{
            conexaoBD.close();;
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}

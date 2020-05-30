package br.com.bg.sisprojeto.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/***
 * @author rubens.leme
 * @version 1.2
 * @data 17/02/2016
 */
public class Conexao {
    /***
     * Parametros de conexao
     */
    //private String host = "localhost";
    private String host = "localhost";
    //private String bancodedados = "sisprojeto";
    private String bancodedados = "bdsisprojeto";
    //private String usuario = "postgres";
    private String usuario = "sa";
    private String senha = "1234567";
    //private String url = "jdbc:postgresql://" + host + "/" + bancodedados;
    private String url = "jdbc:jtds:sqlserver://" + host + "/" + bancodedados;
    private String driver = "net.sourceforge.jtds.jdbc.Driver";
    // private String driver = "org.postgresql.Driver";
    private static Connection conexaoSisProjeto;
    
    
    
    
    /***
     * Método que verifica se possui conexao
     *  
     */
    private boolean possuiConexao() {
        return conexaoSisProjeto != null;
    }

    /***
     * Método que inicializa conexao se  a possuir.
     */
    private void inicializar() {
        if (!possuiConexao()) {
            conectar();
        }
    }

    /***
     * Metodo de Obter conexão
     *  
     */
    public Connection obterConexaoSisProjeto() {
        inicializar();
        return conexaoSisProjeto;
    }
    
    
    
    
    
    
    /***
     * Metodo de encerrar conexão
     * 
     */

    public void encerrarConexao() {
        try {
            conexaoSisProjeto.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /***
     * Metodo de conectar onde se passa o parametro
     * 
     */
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

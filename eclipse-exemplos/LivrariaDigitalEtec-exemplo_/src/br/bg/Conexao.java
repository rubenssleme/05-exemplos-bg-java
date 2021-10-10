package br.bg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**/

public class Conexao {

    private String host = "localhost";
    private String bancodedados = "dbLivrariaDigital";
    private String usuario = "sa";
    private String senha = "1234567";
    private String url = "jdbc:jtds:sqlserver://" + host + "/" + bancodedados;
    private String driver = "net.sourceforge.jtds.jdbc.Driver";
    private static Connection conexaoprojLivrariaDigital;

    private boolean possuiConexao() {
        return conexaoprojLivrariaDigital != null;
    }    
    
    private void inicializar() {
        if (!possuiConexao()) {
            conectar();
        }
    }
    public Connection obterConexaoProjLivrariaDigital() {
        inicializar();
        return conexaoprojLivrariaDigital;
    }
    public void encerrarConexao() {
        try {
            conexaoprojLivrariaDigital.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void conectar() {
        try {
            Class.forName(driver);
            conexaoprojLivrariaDigital = DriverManager
                    .getConnection(url, usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.sgfapm.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Rubens Leme
 */
public class Conexao {
/**
 * Utilização de banco de dados postGreSql
 */
    private String host = "localhost:5432";
    private String bancodedados = "DB_SGFAPM";
      
 
 /**
 * Utilização outros bancos de dados
 */
    //private String user = "sa";
    private String user = "postgres";
   // private String password = "1234567";
    private String password = "12345678";
    private String url; 
    private String banco = "postgres"; //mysql ou sqlserver
    private String driver;

    public Connection getConnection() {
        if (banco.equals("sqlserver")) {
            url = "jdbc:jtds:sqlserver://localhost:1433/DB_SGFAPM";
            driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
        } else if (banco.equals("mysql")) {
            url = "jdbc:mysql://localhost:3306/db_sgfapm?useSSL=false";
            driver = "com.mysql.jdbc.Driver";
        }else if(banco.equals("postgres")){
            url = "jdbc:postgresql://" + host + "/" + bancodedados;
            driver = "org.postgresql.Driver";
        }

        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean checarConexao() throws SQLException {
        try (Connection conexao = new Conexao().getConnection()) {
            return !(conexao.isClosed());
        } catch (Exception e) {
            System.out.println("erro ao checar conexão: " + e);
        }
        return false;
    }
}

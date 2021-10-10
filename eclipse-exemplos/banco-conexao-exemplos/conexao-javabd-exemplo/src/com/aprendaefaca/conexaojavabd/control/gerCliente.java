/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprendaefaca.conexaojavabd.control;

import com.aprendaefaca.conexaojavabd.model.Cliente;
import com.aprendaefaca.conexaojavabd.persistencia.ConexaoBD;
import com.aprendaefaca.conexaojavabd.persistencia.iConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rubens.leme
 */
public class gerCliente implements iConexao<Cliente> {

    ConexaoBD cliBD = new ConexaoBD();

    @Override
    public void salvar(Cliente cli) {
        // *** Metodo de inclusao de clientes
        Connection con = null;
        PreparedStatement ps = null;
        cliBD.conectar();
        con = cliBD.getCon();
        
        try {
            Statement stmt = con.createStatement();
            String sql = "select max(usuCod) from usuarios";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            // Incrementando o ultimo codigo armazenado temos o codigo do novo usuario
            int proximoCodigo = rs.getInt(1) + 1;
            rs.close();

            // Aqui utilizamos a classe PreparedStatement que permite a insercao de 
            // parametros (?) na construcao da string de SQL
            String sqlInsert = "insert into usuarios values(?, ?, ?, ?);";

            ps = con.prepareStatement(sqlInsert);
            ps.setInt(1, proximoCodigo);
            ps.setString(2, cli.getNome());
            ps.setString(3, cli.getCpf());
            ps.setString(4, cli.getRg());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {

            try {
                ps.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void listarTodos(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprendaefaca.conexaojavabd.control;

import com.aprendaefaca.conexaojavabd.model.Fornecedor;
import com.aprendaefaca.conexaojavabd.persistencia.iConexao;

/**
 *
 * @author rubens.leme
 */
public class gerFornecedor implements iConexao<Fornecedor>{

   

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
    public void salvar(Fornecedor f) {
        
    }

    @Override
    public void listarTodos(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

   
}
    

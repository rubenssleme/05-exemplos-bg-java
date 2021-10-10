/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprendaefaca.conexaojavabd.persistencia;

import com.aprendaefaca.conexaojavabd.model.Cliente;

/**
 *
 * @author rubens.leme
 */
public interface iConexao<T> {
    
   
        void salvar(T f);
        void excluir();
        void alterar();
        void consultar(int id);
        void listarTodos(String nome);
       
    }
    
    


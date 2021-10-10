/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carloskafka.sisprojeto;

import br.com.carloskafka.sisprojeto.dominio.Cliente;

/**
 *
 * @author rubens.leme
 */
public class ContextoCliente {

    public ContextoCliente() {
    }

   public static Cliente inicializarObjeto() {
       Cliente cliente = new Cliente();
        cliente.setNome("Rubens Leme");
        cliente.setCpf("123456789");
        cliente.setEndereco("Av. Nelson Palma");
        cliente.setEmail("rubensleme@apf.com.br");
        cliente.setTelefone("3333-4565");

        return cliente;
    }   
    
    
}

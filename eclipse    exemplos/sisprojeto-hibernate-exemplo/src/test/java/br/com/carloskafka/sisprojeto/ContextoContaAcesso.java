/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carloskafka.sisprojeto;

import br.com.carloskafka.sisprojeto.dominio.ContaAcesso;

/**
 *
 * @author rubens.leme
 */
 public  class ContextoContaAcesso {
     

        public ContextoContaAcesso() {
           
        }
        
        public static ContaAcesso fabricarContaAcessoAdministradorComTodosOsDados(){
            ContaAcesso ca = new ContaAcesso();

            ca.setLogin("a");
            ca.setSenha("a");
           
            return ca;
        }
    }

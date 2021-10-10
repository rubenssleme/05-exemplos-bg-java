/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author rubens.leme
 */
public class ControladorAcessoRapido extends ControladorTelaBase{
    
    public ControladorAcessoRapido() {
        super(telaBase);
    }
    public void abrirTelaAlunos(){
        abrirTela(new TelaAlunos());
    }
     public void abrirTelaServidores(){
         abrirTela(new TelaServidores());
    }
      public void abrirTelaADDServidores(){
         abrirTela(new TelaAddServidor());
    }
    
}

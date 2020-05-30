/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JDesktopPane;

/**
 *
 * @author rubens.leme
 */
public class ControladorTelaPrincipal extends ControladorTelaBase{
    
    public ControladorTelaPrincipal(JDesktopPane telaBase) {
        super(telaBase);
    }
    
    public void abrirTelaDeAcessoRapido(){
        abrirTela(new TelaAcessoRapido());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author rubens.leme
 */
public class ControladorTelaBase {
   protected static JDesktopPane telaBase;

    public ControladorTelaBase(JDesktopPane telaBase) {
        this.telaBase = telaBase;
    }
    
    protected void abrirTela(JInternalFrame tela){
        this.telaBase.add(tela);
        tela.setVisible(true);
        tela.moveToFront();
    }
    
}

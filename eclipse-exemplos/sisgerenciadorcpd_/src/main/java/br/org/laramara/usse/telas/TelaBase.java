/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.telas;

import br.org.laramara.usse.controladores.ControladorTela;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author rubens.leme
 */
public abstract class TelaBase {

    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane desktop;
    private AcessoRapido acessoRapido;
    //  private CadastroServidores cadastroServidor;

    /*   public void telaCadastroServidores() {
        if (cadastroServidor == null) {
            cadastroServidor = new CadastroServidores();
            desktop.add(cadastroServidor);
        }
        cadastroServidor.setVisible(true);
        mostrarTela(cadastroServidor);
    }*/
    private void mostrarTela(JInternalFrame tela) {
        if (tela != acessoRapido) {
            tela.moveToFront();
        } else {
            tela.moveToBack();
        }
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setSize(desktop.getSize());
        desktop.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

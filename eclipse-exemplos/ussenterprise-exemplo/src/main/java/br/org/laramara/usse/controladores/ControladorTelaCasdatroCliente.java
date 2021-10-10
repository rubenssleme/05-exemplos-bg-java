/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.controladores;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author rubens leme
 * @data 11/04/2017
 */
public class ControladorTelaCasdatroCliente {
    private JTextField jtfNome,jtfCPF,jtfRG;
    private JButton jbuSalvar,jbuCancelar;
    private JComboBox<String> jcbSexo;

    public ControladorTelaCasdatroCliente(JTextField jtfNome, JTextField jtfCPF, JTextField jtfRG, 
            JButton jbuSalvar, JButton jbuCancelar, JComboBox<String> jcbSexo) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jbuSalvar = jbuSalvar;
        this.jbuCancelar = jbuCancelar;
        this.jcbSexo = jcbSexo;
    }

    public JTextField getJtfNome() {
        return jtfNome;
    }

    public void setJtfNome(JTextField jtfNome) {
        this.jtfNome = jtfNome;
    }

    public JTextField getJtfCPF() {
        return jtfCPF;
    }

    public void setJtfCPF(JTextField jtfCPF) {
        this.jtfCPF = jtfCPF;
    }

    public JTextField getJtfRG() {
        return jtfRG;
    }

    public void setJtfRG(JTextField jtfRG) {
        this.jtfRG = jtfRG;
    }

    public JButton getJbuSalvar() {
        return jbuSalvar;
    }

    public void setJbuSalvar(JButton jbuSalvar) {
        this.jbuSalvar = jbuSalvar;
    }

    public JButton getJbuCancelar() {
        return jbuCancelar;
    }

    public void setJbuCancelar(JButton jbuCancelar) {
        this.jbuCancelar = jbuCancelar;
    }

    public JComboBox<String> getJcbSexo() {
        return jcbSexo;
    }

    public void setJcbSexo(JComboBox<String> jcbSexo) {
        this.jcbSexo = jcbSexo;
    }

    
    
    
    
    
    
}

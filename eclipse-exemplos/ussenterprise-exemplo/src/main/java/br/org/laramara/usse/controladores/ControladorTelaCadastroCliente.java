/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.controladores;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author rubens.leme
 */
public class ControladorTelaCadastroCliente {
    private JTextField jtfNome,jtfCPF,jtfRG;
    private JComboBox<String> jcbSexo;

    public ControladorTelaCadastroCliente(JTextField jtfNome, JTextField jtfCPF, JTextField jtfRG, JComboBox<String> jcbSexo) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jcbSexo = jcbSexo;
    }
    
    
    
}

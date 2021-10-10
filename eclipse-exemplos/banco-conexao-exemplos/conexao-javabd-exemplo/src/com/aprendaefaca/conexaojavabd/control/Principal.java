/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprendaefaca.conexaojavabd.control;

import javax.swing.JFrame;

/**
 *
 * @author Rubens Leme
 * @version 1.0
 * @data criação 25/03/2015
 * @data alteração 25/03/2015
 */
import com.aprendaefaca.conexaojavabd.view.CadastroCliente;
import com.aprendaefaca.conexaojavabd.view.TelaCadastro;

public class Principal {

    public static void main(String args[]) {
        //CadastroCliente cadCli = new CadastroCliente();
        TelaCadastro cadCli = new TelaCadastro();
        cadCli.setVisible(true);
        cadCli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadCli.setLocationRelativeTo(null);
        cadCli.setResizable(false);
    }

}

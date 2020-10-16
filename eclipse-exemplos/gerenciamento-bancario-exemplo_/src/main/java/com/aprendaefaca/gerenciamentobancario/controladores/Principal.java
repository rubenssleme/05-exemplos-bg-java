package com.aprendaefaca.gerenciamentobancario.controladores;

import javax.swing.*;
import com.aprendaefaca.gerenciamentobancario.telas.TelaLogin;

public class Principal {

    public static void main(String args[]) {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setResizable(false);

    }
}

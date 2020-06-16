package br.com.biblioteca.controller;

import br.com.biblioteca.dao.LoginDao;
import br.com.biblioteca.view.MenuView;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rubens leme
 */
public class LoginController {

    LoginDao loginDao = new LoginDao();

    public void verificarLogin(JFrame loginView, JTextField username, JTextField password) throws Exception {
        if (loginDao.isValidLoginAndPassword(username.getText(), password.getText())) {
            new MenuView().setVisible(true);
            loginView.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Senha Incorreta Rapa!");
        }
    }

}

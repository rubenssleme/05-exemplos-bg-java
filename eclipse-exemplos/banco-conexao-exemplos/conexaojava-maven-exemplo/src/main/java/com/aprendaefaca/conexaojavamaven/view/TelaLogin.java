package com.aprendaefaca.conexaojavamaven.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.aprendaefaca.conexaojavamaven.control.ControladorTelaLogin;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {
	JButton jbtFechar;
	JButton jbtEntrar;
	JPasswordField jtfSenha;
	JTextField jtfUsuario;
	JLabel jlUsuario;
	JLabel jlSenha;

	ControladorTelaLogin controlador;
	
	public TelaLogin() {

		controlador = new ControladorTelaLogin(this, jbtFechar, jbtEntrar,
				jtfSenha, jtfUsuario, jlUsuario, jlSenha);
		controlador.abrirTela();
	}

	public static void main(String[] args) {
		new TelaLogin();		
	}
}

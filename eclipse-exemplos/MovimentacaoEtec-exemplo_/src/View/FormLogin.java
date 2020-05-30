package View;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.GerenciadorLogin;
import Modell.Usuario;

@SuppressWarnings("serial")
public class FormLogin extends JFrame{
	
		// Instanciação dos objetos
		GerenciadorLogin gerenciadorLogin = new GerenciadorLogin();
		Usuario usuario = new Usuario("Administrador", "admin", "123"); // Inicialização dos atributos pelo construtor

		JLabel lLogin,lSenha;
		JTextField tFLogin;
		JPasswordField tPSenha;
		JButton bOk,bCancelar;
		
		public FormLogin(){
			
			super("Login");
			Container tela = getContentPane();
			setLayout(null);
						
			lLogin = new JLabel("Login: ");
			lLogin.setBounds(70,60,100,20);
			
			tFLogin = new JTextField(10);
			tFLogin.setBounds(120, 60, 100, 20);
			
			lSenha = new JLabel("Senha: ");
			lSenha.setBounds(70,100,100,20);
			tPSenha = new JPasswordField(10);
			tPSenha.setBounds(120,100,100,20);
			
			bOk = new JButton("Ok");
			bOk.setBounds(50,170,100,20);
			bOk.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							
							// Obtém a senha e converte para String
							String senha = new String(tPSenha.getPassword());
							
							// Verifica o retorno do metodo validarUsuario 
							if( gerenciadorLogin.validarUsuario( tFLogin.getText(), senha, usuario ) ){
								// Se for true carrega o formulario principal
								FormMenu menu = new FormMenu();
								menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								menu.setVisible(true);
								// Descarrega o formulario de login
								dispose();								
							}
							
						}
					}
			);

			bCancelar = new JButton("Cancelar");
			bCancelar.setBounds(180,170,100,20);
			bCancelar.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							System.exit(0);
						}
					}
			);
			
			tela.add(lLogin);
			tela.add(tFLogin);
			tela.add(lSenha);
			tela.add(tPSenha);
			tela.add(bOk);
			tela.add(bCancelar);
			
			setSize(350, 250);
			setVisible(true);
			setLocationRelativeTo(null);
			
		}
}

package exercicio_Login;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaDeLogin extends JFrame{
	JButton btnLogin, btnCancelar;
	JLabel lblLogin, lblSenha, lblCadeado;
	JTextField txtLogin, txtSenha;
	
	public TelaDeLogin(){
		super ("Tela de Login");
		Container tela = getContentPane();
		setLayout(null);
		tela.setBackground(new Color(153,217,234));
		
		//*********BOTÕES e LABEL************\\
		btnLogin = new JButton ("Login");
		btnCancelar = new JButton ("Cancelar");
		
		lblLogin = new JLabel ("Login");
		lblSenha = new JLabel ("Senha");
		lblCadeado = new JLabel (new ImageIcon("imagens/cadeado.png"));
		
		txtLogin = new JTextField (50);
		txtSenha = new JTextField (50);
		
		
	  //btnLogin.setBounds(x, y, width, height);
		btnLogin.setBounds(150, 160, 90, 30);
		
		
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(validarLogin(txtLogin.getText(), txtSenha.getText())){
					JOptionPane.showMessageDialog(null, "Logado com sucesso!!!");
					new Tela2().setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, " Login incorreto!!!");
				}
				
			}
		});
		
		
			
		
		
		
		
		btnCancelar.setBounds(270, 160, 90, 30);
		lblLogin.setBounds(150, 20, 150, 30);
		lblSenha.setBounds(150, 80, 150, 30);
		lblCadeado.setBounds(10, 20, 128, 128);
		txtLogin.setBounds(150,50,150,20);
		txtSenha.setBounds(150,110,150,20);
		tela.add(btnLogin);
		tela.add(btnCancelar);
		tela.add(lblLogin);
		tela.add(lblSenha);
		tela.add(lblCadeado);
		tela.add(txtLogin);
		tela.add(txtSenha);
		setSize(400,250);
		setLocationRelativeTo(null);
		
		//*********ÍCONE*******\\
		ImageIcon icone = new ImageIcon ("imagens/cadeado.png");
		setIconImage(icone.getImage());
		
		
	}
	
	
	
	
	private boolean validarLogin(String login, String senha){
		
		boolean retorno = false;
		
		if((login.equals("a"))&& (senha.equals("b"))){
			retorno = true;
		}else{
			retorno = false;
		}
		
		return retorno;
	}
	
	
}
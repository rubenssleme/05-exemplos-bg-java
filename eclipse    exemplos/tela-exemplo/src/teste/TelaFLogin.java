package teste;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaFLogin extends JFrame {
	private JLabel jlaNome, jlaSenha, jlaCidade ;
	private JTextField jtfNome, jtfSenha;
	private JButton jbuOK, jbuCancelar;

	public TelaFLogin(){
		super("Tela de Login");
		Container tela = getContentPane();
		setLayout(null);
		
		jlaNome = new JLabel("Nome:");
		jlaNome.setBounds(10,10,50,20);
		jtfNome = new JTextField();
		jtfNome.setBounds(55, 10, 100, 20);
		
		jlaSenha = new JLabel("Senha:"); 
		jlaSenha.setBounds(10,40,50,20);
		jtfSenha = new JTextField();
		jtfSenha.setBounds(55, 40, 100, 20);
		
		ImageIcon icone = new ImageIcon("duke.jpg");
		jlaCidade = new JLabel(icone);
		jlaCidade.setBounds(10, 10, 100, 150);
	
	
		//this.add(jlaNome);
		//this.add(jtfNome);
		//this.add(jlaSenha);
		//this.add(jtfSenha);
		this.add(jlaCidade);
		tela.setBackground(Color.blue);
		setSize(450,250);
		
	}

}

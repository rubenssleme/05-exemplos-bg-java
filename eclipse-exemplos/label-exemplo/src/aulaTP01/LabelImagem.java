package aulaTP01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelImagem extends JFrame{

	private JLabel jlaNome, jlaSenha, jlaImagem;
	private JTextField jtfNome,jtfSenha;
	private JButton jbuOK,jbuCancelar;

	public LabelImagem(){
		super("Aula de Compilação e Interpretação");
		Container tela = getContentPane();
		setLayout(null);

		jlaNome = new JLabel("Nome:");
		jlaNome.setBounds(170, 45, 40, 20);
		jlaNome.setForeground(Color.red);
		jtfNome = new JTextField();
		jtfNome.setBounds(220,45, 40, 20);
		// Adicionar em tela 
		this.add(jlaNome);
		this.add(jtfNome);

		jlaSenha = new JLabel("Senha:");
		jlaSenha.setBounds(170,85,100,20);
		jlaSenha.setForeground(Color.red);
		jtfSenha = new JTextField();
		jtfSenha.setBounds(220,85, 40, 20);
		//Adicionar e tela
		this.add(jlaSenha);
		this.add(jtfSenha);

		//adiconar imagem na label
		ImageIcon icone = new ImageIcon("Tux.gif");
		jlaImagem  = new JLabel(icone);
		jlaImagem.setBounds(20, 20, 150, 150);
		//Adicionar na tela
		this.add(jlaImagem);
		
		jbuOK = new JButton("OK");
		jbuOK.setBounds(30, 170,130,30);
		jbuCancelar = new JButton("Cancelar");
		jbuCancelar.setBounds(170,170,130,30);
		this.add(jbuOK);
		this.add(jbuCancelar);
	
		setSize(345,270);
		//Tela Centralizada 
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args){
		LabelImagem app = new LabelImagem();
		app.setVisible(true);

	}

}

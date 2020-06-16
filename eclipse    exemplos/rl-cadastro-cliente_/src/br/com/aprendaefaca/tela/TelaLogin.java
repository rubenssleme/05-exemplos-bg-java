package br.com.aprendaefaca.tela;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import br.com.aprendaefaca.modelo.Cliente;

public class TelaLogin extends JFrame implements ActionListener{

	JLabel lnome, lsenha;
	JTextField tnome;
	JPasswordField tsenha;
	JButton bOK, bCancelar;
	Cliente gerenciadorcliente ;

	public TelaLogin(){ // construtor 
		super("Tela de Login");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		lnome = new JLabel("Nome: ");
		tnome = new JTextField("");
		lnome.setBounds(50,40,100,20);
		tnome.setBounds(90,40,100,20);
		
		lsenha = new JLabel("Senha: ");
		tsenha = new JPasswordField();
		lsenha.setBounds(50,60,100,20);
		tsenha.setBounds(90,60,100,20);

		bOK = new JButton("OK");
		bCancelar = new JButton("Cancelar");
		
		bOK.setBounds(90,150,100,20);
		bOK.addActionListener(this);
		
		bCancelar.setBounds(190,150,100,20);
		bCancelar.addActionListener(this);
		this.add(lnome);
		this.add(tnome);
		this.add(lsenha);
		this.add(tsenha);
		this.add(bOK);
		this.add(bCancelar);
		
		this.setSize(400,250);
		this.setVisible(true);
		
		

	}

	
	public void abrirTela(){
		
		TelaMenu menu = new TelaMenu();
		menu.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()== bCancelar ){
			JOptionPane.showMessageDialog(null, "Teste Botão Cancelar");
			System.exit(0);
		}else if(e.getSource()== bOK){
			
			String 	senha = new  String(tsenha.getPassword()); 	
			if ((tnome.getText().equals("Rubens")    &&  (senha.equals("123")))){
				JOptionPane.showMessageDialog(null, "Senha ok ");
				abrirTela();
			}else{
				JOptionPane.showMessageDialog(null, "Senha incorreta ");
				
			}
			
		}
		
	}



}

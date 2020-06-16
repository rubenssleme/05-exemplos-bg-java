package br.com.aprendaefaca.tela;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaDeLogin extends JFrame implements ActionListener{

	JLabel lblnome, lblsenha;
	JTextField txtnome, txtsenha;
	JButton btnOK, btnCancelar;

	public TelaDeLogin(){
		super("Tela de Login");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		lblnome = new JLabel("Nome: ");
		txtnome = new JTextField("");
		lblnome.setBounds(50,40,100,20);
		txtnome.setBounds(90,40,100,20);
		
		lblsenha = new JLabel("Senha: ");
		txtsenha = new JTextField();
		lblsenha.setBounds(50,60,100,20);
		txtsenha.setBounds(90,60,100,20);

		btnOK = new JButton("OK");
		btnCancelar = new JButton("Cancelar");
		
		btnOK.setBounds(90,150,100,20);
		btnOK.addActionListener(this);
		
		btnCancelar.setBounds(190,150,100,20);
		btnCancelar.addActionListener(this);
		this.add(lblnome);
		this.add(txtnome);
		this.add(lblsenha);
		this.add(txtsenha);
		this.add(btnOK);
		this.add(btnCancelar);
		
		this.setSize(400,250);
		this.setVisible(true);
		
		

	}

	
	public void abrirTela(){
		
		TelaDeMenu menu = new TelaDeMenu();
		menu.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()== btnCancelar ){
			JOptionPane.showMessageDialog(null, "Teste Botão Cancelar");
			System.exit(0);
		}else if(e.getSource()== btnOK){
			
					
			if ((txtnome.getText().equals("Rubens")    &&  (txtsenha.getText().equals("123")))){
				JOptionPane.showMessageDialog(null, "Senha ok ");
				abrirTela();
			}else{
				JOptionPane.showMessageDialog(null, "Senha incorreta ");
				
			}
			
		}
		
	}



}

package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import Controller.Gerenciadortemperatura;
import Model.Temperatura;
public class Ftemperatura extends Frame implements ActionListener, WindowListener{
	private JTextField tValor;
	private JLabel lValor;
	private JButton bConverter;
	
	public Ftemperatura(){
		
		lValor= new JLabel("Valor: ");
		lValor.setSize(50, 20);
		lValor.setLocation(20, 30);
		
		tValor = new JTextField();
		tValor.setSize(90, 20);
		tValor.setLocation(70, 30);
		
		bConverter = new JButton("Converter");
		bConverter.setSize(90, 20);
		bConverter.setLocation(40, 60);
		bConverter.addActionListener(this);
		
		this.setTitle("Login");
		this.setResizable(true);
		this.setSize(200, 90);
		this.setLocation(200, 400);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		
		this.add(lValor);
		this.add(tValor);
		this.add(bConverter);
		this.addWindowListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bConverter){
			Gerenciadortemperatura gt = new Gerenciadortemperatura();
			Temperatura a;
			a=gt.convertCF(Double.parseDouble(tValor.getText()));
			JOptionPane.showMessageDialog(null, "O valor em "+a.getNome()+
					" é "+a.getValor());
		}
	}
	private Gerenciadortemperatura Gerenciadortemperatura() {
		// TODO Auto-generated method stub
		return null;
	}
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}

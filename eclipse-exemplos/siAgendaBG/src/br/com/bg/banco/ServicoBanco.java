package br.com.bg.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class ServicoBanco {

	static String nomeContato = JOptionPane.showInputDialog("Digite o nome do contato:");
	static String dataContato = JOptionPane.showInputDialog("Digite o data do contato");
	
	public static void main(String[] args) {
		criarBanco();
	}
	
	public static void criarBanco() {
		Banco banco = new Banco();
		Contato contato = new Contato();
	
		contato.setNomeContato(nomeContato);
		banco.adiciona(contato);
		
		System.out.println(contato.toString());
		System.out.println(banco.getContato().toString());
	}






}	



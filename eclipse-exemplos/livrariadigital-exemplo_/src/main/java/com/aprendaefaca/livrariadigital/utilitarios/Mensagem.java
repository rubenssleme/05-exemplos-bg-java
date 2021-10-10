package com.aprendaefaca.livrariadigital.utilitarios;
/**
 * @autor Rubens Leme
 * @data 16/03/2016
 * @version 1.0
 */
import javax.swing.JOptionPane;

public class Mensagem {
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static String exibirPergunta(String mensagem) {
		return JOptionPane.showInputDialog(null, mensagem);
	}
}

package somaValor;

import javax.swing.JOptionPane;

public class Soma {
 public static void main(String[] args) {
	 
	 	String  message1 = "DIGITE o primeiro valor: " ;
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(message1));
		
		String  message2 = "DIGITE o segundo valor: " ;
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog(message2));
		
		JOptionPane.showMessageDialog(null, "A soma é : " + (valor1 + valor2));
		
}
}

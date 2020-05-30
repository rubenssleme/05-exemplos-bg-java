package minhasinfo;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
	
		//System.out.println("Hello World");
		String  message1 = "DIGITE SEU NOME: " ;
		
		String message = JOptionPane.showInputDialog(message1);
		JOptionPane.showMessageDialog(null, message);
	}

}

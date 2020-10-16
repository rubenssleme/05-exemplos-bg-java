package somaDoisValores;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Soma soma  = new Soma();
		soma.somaValores();
		JOptionPane.showMessageDialog(null, "A soma dos valores é : " + soma.getResultado());

	}

}

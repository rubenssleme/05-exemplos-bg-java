package somaDoisNumeros;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Cria��o instancia soma.
		Soma soma = new Soma();
		//Usando objeto chamando o metodo somaValores. 
		soma.somaValores();
		//Exibe o Resultado.
		JOptionPane.showMessageDialog(null, "A soma dos valores � : " 
		+ soma.getResultadoSoma());
	}

}

import java.util.Scanner;

import javax.swing.JOptionPane;


public class SomaDeDoisNumeros2Tela {

	public static void main(String[] args) {

		//Declaração  e Atribuição de Varivel do tipo int.
		int numero1 = 0, numero2 = 0, soma =0;
		//Entrada do 1º Numero
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º numero: "));
		//Entrada do 2º Numero
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º numero: "));
		//Calculo e Atribuiçãode valores
		soma = (numero1 + numero2);
		//Exibição na Tela
		JOptionPane.showMessageDialog(null,"O resultado da soma dos numeros informados é : " + soma);

	}

}

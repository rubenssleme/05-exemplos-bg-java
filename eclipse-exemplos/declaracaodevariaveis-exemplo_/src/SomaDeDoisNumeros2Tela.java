import java.util.Scanner;

import javax.swing.JOptionPane;


public class SomaDeDoisNumeros2Tela {

	public static void main(String[] args) {

		//Declara��o  e Atribui��o de Varivel do tipo int.
		int numero1 = 0, numero2 = 0, soma =0;
		//Entrada do 1� Numero
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1� numero: "));
		//Entrada do 2� Numero
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2� numero: "));
		//Calculo e Atribui��ode valores
		soma = (numero1 + numero2);
		//Exibi��o na Tela
		JOptionPane.showMessageDialog(null,"O resultado da soma dos numeros informados � : " + soma);

	}

}

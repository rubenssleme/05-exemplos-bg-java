import java.util.Scanner;

import javax.swing.JOptionPane;


public class CalculaMediaDe4Alunos {

	public static void main(String[] args) {

		//Declara��o  e Atribui��o de Varivel do tipo int.
		int nota1 = 0, nota2 = 0,nota3 = 0,nota4 = 0,  media =0;
		//Entrada da 1� Nota
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1� nota: "));
		//Entrada da 2� Nota
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2� nota: "));
		//Entrada da 3� Nota
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 3� nota: "));
		//Entrada da 4� Nota
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 4� nota: "));
		//Calculo e Atribui��ode valores
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		//Exibi��o na Tela
		JOptionPane.showMessageDialog(null,"A  M�dia do Aluno  � : " + media);

	}

}

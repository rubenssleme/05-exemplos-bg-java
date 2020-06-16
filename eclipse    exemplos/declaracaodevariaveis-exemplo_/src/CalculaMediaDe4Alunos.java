import java.util.Scanner;

import javax.swing.JOptionPane;


public class CalculaMediaDe4Alunos {

	public static void main(String[] args) {

		//Declaração  e Atribuição de Varivel do tipo int.
		int nota1 = 0, nota2 = 0,nota3 = 0,nota4 = 0,  media =0;
		//Entrada da 1º Nota
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1º nota: "));
		//Entrada da 2º Nota
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2º nota: "));
		//Entrada da 3º Nota
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 3º nota: "));
		//Entrada da 4º Nota
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 4º nota: "));
		//Calculo e Atribuiçãode valores
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		//Exibição na Tela
		JOptionPane.showMessageDialog(null,"A  Média do Aluno  é : " + media);

	}

}

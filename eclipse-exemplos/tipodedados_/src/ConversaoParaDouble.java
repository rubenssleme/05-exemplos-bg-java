import javax.swing.JOptionPane;

public class ConversaoParaDouble {

	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 10;

		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º Valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º Valor"));
		
		double resultado = (double) (valor1 + valor2);
		
		System.out.println("Resultado - " + resultado);

	}

}

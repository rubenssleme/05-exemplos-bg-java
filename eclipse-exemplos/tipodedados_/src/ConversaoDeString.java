import javax.swing.JOptionPane;

public class ConversaoDeString {

	public static void main(String[] args) {
		double valor1;
		double valor2;

		//valor1 = (double) JOptionPane.showInputDialog("Digite o 1º Valor");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º Valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º Valor"));

		double resultado = (valor1 + valor2);

		JOptionPane.showMessageDialog(null,"Resultado - " + resultado);

	}

}

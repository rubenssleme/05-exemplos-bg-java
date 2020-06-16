import javax.swing.JOptionPane;
public class media {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1"));
	int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2"));
	int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3"));
	JOptionPane.showMessageDialog(null,"A media é: " + String.valueOf((valor1 + valor2 + valor3)/3));
	}
}
 
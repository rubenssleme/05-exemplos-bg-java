import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String mensagem = "Digite um valor ";
		int valor = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
//		JOptionPane.showMessageDialog(null, valor);
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		JOptionPane.showMessageDialog(null, valor + valor1);
		
	}
}

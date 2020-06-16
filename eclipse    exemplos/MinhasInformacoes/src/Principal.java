import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	String message = "Digite seu Nome: ";
    String	meuNome = JOptionPane.showInputDialog(message);
    JOptionPane.showMessageDialog(null, meuNome);
    
//		String message = "Digite um Valor: ";
//		int	valor1 = Integer.parseInt(JOptionPane.showInputDialog(message));
//		
//		String message2 = "Digite um Valor2: ";
//		int	valor2 = Integer.parseInt(JOptionPane.showInputDialog(message2));
//    
//		JOptionPane.showMessageDialog(null, valor1 + valor2);
    

	}   

}

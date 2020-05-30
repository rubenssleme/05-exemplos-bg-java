import javax.swing.JOptionPane;

public class Principal {
	static String nomePessoa;

	public static void main(String[] args) {

		nomePessoa = digiteSeuNome();
		mostrarAvisoNaTela();
	}

	public static void mostrarAvisoNaTela() {
		JOptionPane.showMessageDialog(null, "Ola Mundo - " + nomePessoa);
	}

	public static String digiteSeuNome() {
		return JOptionPane.showInputDialog("Digite seu nome");
	}
}

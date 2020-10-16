

/**
 * Importação do JOptionPane
 */
import javax.swing.JOptionPane;

public class Mensagem {

	/**
	 * 
	 * Método  que exibe a mensagem escolhida na tela 
	 */
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null,mensagem);

	}


	/**
	 * método que  exibe uma pergunta ao usuario.
	 */
	public static String exibirPergunta(String mensagem) {
		return JOptionPane.showInputDialog(null, mensagem);
	}
}

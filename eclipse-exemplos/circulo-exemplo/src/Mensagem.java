

/**
 * Importa��o do JOptionPane
 */
import javax.swing.JOptionPane;

public class Mensagem {

	/**
	 * 
	 * M�todo  que exibe a mensagem escolhida na tela 
	 */
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null,mensagem);

	}


	/**
	 * m�todo que  exibe uma pergunta ao usuario.
	 */
	public static String exibirPergunta(String mensagem) {
		return JOptionPane.showInputDialog(null, mensagem);
	}
}

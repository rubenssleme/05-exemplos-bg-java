package br.com.carloskafka.sishibernateclient.utilitarios;

import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

public class TextoUtils {
	public static String obterTexto(JComponent campo) {
		return ((JTextComponent) campo).getText();
	}
	
}

package br.laramara.ti.sisweb.utilitarios;

public class TextoUtils {
	public static String anularVazio(String texto) {
		return texto == null || texto.isEmpty() ? null : texto;
	}

	public static boolean estaVazio(String texto) {
		return (removerCaracteresInvalidos(texto).isEmpty());
	}

	public static String removerCaracteresInvalidosEAnularVazio(String texto) {
		if (texto != null) {
			String retorno = removerCaracteresInvalidos(texto);
			return TextoUtils.anularVazio(retorno);
		} else {
			return null;
		}
	}

	public static String removerCaracteresInvalidos(String texto) {
		return texto.replace(" ", "").replace("(", "").replace(")", "");
	}

	public static String removerChaves(String texto) {
		return texto != null ? texto.replace("[", "").replace("]", "") : null;
	}

	public static String removerVirgulaFinal(String texto) {
		String textoSemEspacoInicialFinal = removerEspacosADireitaEAEsquerda(texto);
		return textoSemEspacoInicialFinal.substring(0, textoSemEspacoInicialFinal.length() - 1);
	}

	public static String removerEspacosADireitaEAEsquerda(String texto) {
		return texto.trim();
	}

	public static Object[] obterPalavras(Object texto) {
		String REGEX_CARACTERES_INVALIDOS = "[,:;]";
		String REGEX_TODOS_ESPACOS = "\\s+";
		String VIRGULA = ",";
		String ESPACO = " ";

		Object[] palavras = new Object[1];
		if (texto instanceof Long) {
			palavras[0] = (Long) texto;
		} else if (texto instanceof Boolean) {
			palavras[0] = (Boolean) texto;
		} else {
			texto = removerEspacosADireitaEAEsquerda((String) texto);
			texto = ((String) texto).replaceAll(REGEX_CARACTERES_INVALIDOS, ESPACO);
			texto = ((String) texto).replaceAll(REGEX_TODOS_ESPACOS, VIRGULA);
			palavras = ((String) texto).split(VIRGULA);
		}
		return palavras;
	}
}

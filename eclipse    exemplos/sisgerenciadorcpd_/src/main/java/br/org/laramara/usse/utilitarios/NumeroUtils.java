package br.org.laramara.usse.utilitarios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rubens.leme
 */
public class NumeroUtils {

    public static Integer obterNumeroInteiroInvalido(String valor) {
        return !valor.isEmpty() ? Integer.parseInt(valor) : new Integer(999999999);
    }

    public static Integer obterNumeroInteiroInvalido() {
        return new Integer(999999999);
    }

    public static Integer obterNumeroAPartirDeString(String valor) {
        return !valor.isEmpty() ? Integer.parseInt(valor) : new Integer(0);
    }

    public static Long obterNumeroLongInvalido(String valor) {
        if (!valor.isEmpty()) {
            return Long.parseLong(valor);
        }
        return new Long(999999999);
    }

    public static boolean estaVazio(String texto) {
        return texto.isEmpty();
    }

    public static boolean numeroInteiroInvalido(Integer numero) {
        return (numero != null && numero.equals(obterNumeroInteiroInvalido()));
    }
    
    public static Integer retornaInteiroOuInvalido(String texto) {
		Integer retorno = new Integer(0);
		if (texto != null && !TextoUtils.estaVazio(texto)) {
			                 Pattern padraoApenasNumeros = Pattern.compile("[0-9]*");
			if (((Matcher) padraoApenasNumeros.matcher(TextoUtils
					.removerCaracteresInvalidos(texto))).matches()) {
				retorno = new Integer(
						TextoUtils.removerCaracteresInvalidos(texto));
			} else {
				retorno = obterNumeroInteiroInvalido();
			}
		} else {
			retorno = null;
		}
		return retorno;
	}
}

package com.br.rubensleme.dominio.utilitario;

import java.util.ArrayList;
import java.util.List;

public class TextoUtils {

	public static List<Character> obterLetras(String palavra) {
		List<Character> letras = new ArrayList<>();

		char letrasObtidas[] = palavra.toCharArray();

		for (char letra : letrasObtidas) {
			letras.add(letra);
		}
		return letras;
	}

	public static List<Character> obterLetrasPorIndice(List<Character> letras, int indiceInicial, int indiceFinal) {
		return letras.subList(indiceInicial, indiceFinal);
	}
}

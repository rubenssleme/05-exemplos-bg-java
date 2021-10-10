package com.br.rubensleme.dominio.utilitario;

import java.util.List;


import com.br.rubensleme.dominio.utilitario.NumeroUtils;

public class BancoDePalavras {
	/*private static List<String> palavras = Arrays.asList("Joao", "Hipopotamo", "Pedro", "Maria", "Videogame",
			"Interseccao", "Feliz", "Triste", "Trote");*/
	
	
	private static List<String> palavras = new LeituraArquivoTXT().getLinhas();

	public static String obterPalavraAleatoria() {
		return palavras.get(NumeroUtils.gerarNumeroAleatorio(obterQuantidade()));
	}

	private static int obterQuantidade() {
		return palavras.size();
	}

}

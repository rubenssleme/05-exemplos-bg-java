package br.com.carloskafka.sisjogopalavrasembaralhadas.gerenciador;

import java.util.Arrays;
import java.util.List;

import br.com.carloskafka.sisjogopalavrasembaralhadas.utilitario.NumeroUtils;

public class BancoDePalavras {
	private static List<String> palavras = Arrays.asList("Joao", "Hipopotamo", "Pedro", "Maria", "Videogame",
			"Interseccao", "Feliz", "Triste", "Trote");

	public static String obterPalavraAleatoria() {
		return palavras.get(NumeroUtils.gerarNumeroAleatorio(obterQuantidade()));
	}

	private static int obterQuantidade() {
		return palavras.size();
	}

}

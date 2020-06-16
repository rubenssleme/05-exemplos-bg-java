package br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.embaralhadores;

import java.util.Collections;
import java.util.List;

import br.com.carloskafka.sisjogopalavrasembaralhadas.utilitario.TextoUtils;

public class EmbaralhadorInverterPalavra implements IEmbaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuilder builder = new StringBuilder();

		List<Character> letras = TextoUtils.obterLetras(palavra);

		int quantidadeTotal = letras.size();
		int quantidadeMetade = quantidadeTotal / 2;

		List<Character> primeiraMetade = TextoUtils.obterLetrasPorIndice(letras, 0, quantidadeMetade);
		List<Character> segundaMetade = TextoUtils.obterLetrasPorIndice(letras, quantidadeMetade, quantidadeTotal);

		Collections.reverse(primeiraMetade);

		segundaMetade.forEach(letra -> builder.append(letra));
		primeiraMetade.forEach(letra -> builder.append(letra));

		return builder.toString();
	}

}

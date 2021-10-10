package br.com.carloskafka.sisjogopalavrasembaralhadas.dominio;

import br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.embaralhadores.IEmbaralhador;

public interface IMecanicaDoJogo {
	boolean palavraEstaCorreta(String primeiraPalavra, String segundaPalavra);
	boolean fimDeJogo();
	int obterPontuacaoFinal();
	void computarPontos();
	boolean validarPalavras(String primeiraPalavra, String segundaPalavra);
	IEmbaralhador obterEmbaralhador();
	void computarErros();
}

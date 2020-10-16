package com.br.rubensleme.dominio;

import com.br.rubensleme.dominio.embaralhador.IEmbaralhador;

public interface IMecanicaDoJogo {

	boolean palavraEstaCorreta(String primeiraPalavra, String segundaPalavra);
	boolean fimDeJogo();
	void computarPontos();
	void computarErros();
	int obterPontuacaoFinal();
	boolean validarPalavras(String primeiraPalavra, String segundaPalavra);
	IEmbaralhador obterEmbaralhador();
	
	
}

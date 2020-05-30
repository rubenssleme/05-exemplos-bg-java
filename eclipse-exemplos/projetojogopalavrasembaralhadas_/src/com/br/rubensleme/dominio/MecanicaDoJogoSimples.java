package com.br.rubensleme.dominio;

import com.br.rubensleme.dominio.embaralhador.IEmbaralhador;
import com.br.rubensleme.dominio.fabrica.FabricaEmbaralhador;

public class MecanicaDoJogoSimples implements IMecanicaDoJogo {
	private static final int PONTUACAO_MAXIMA = 10;
	private static final int MAXIMO_ERROS_PERMITIDOS = 5;
	private int erros;
	private int pontuacao;

	public MecanicaDoJogoSimples() {
		inicializar();
	}

	private void inicializar() {
		pontuacao = 0;
		erros = 0;
	}

	@Override
	public IEmbaralhador obterEmbaralhador() {
		return FabricaEmbaralhador.obterEmbaralhadorAleatorio();
	}

	private boolean maximoErrosPermitidos() {
		return erros > MAXIMO_ERROS_PERMITIDOS;
	}

	private boolean pontuacaoMaxima() {
		return pontuacao == PONTUACAO_MAXIMA;
	}

	@Override
	public int obterPontuacaoFinal() {
		return pontuacao;
	}

	@Override
	public void computarPontos() {
		if(pontuacao < PONTUACAO_MAXIMA){
			pontuacao++;
		}else{
			pontuacao = PONTUACAO_MAXIMA;
		}

	}

	@Override
	public void computarErros() {
		if(erros<5){
			erros++;
			removerPontos();

		}else{
			erros = MAXIMO_ERROS_PERMITIDOS;
		}
	}

	private void removerPontos() {
		pontuacao--;
	}

	@Override
	public boolean fimDeJogo() {
		return maximoErrosPermitidos() || pontuacaoMaxima();
	}

	@Override
	public boolean palavraEstaCorreta(String primeiraPalavra, String segundaPalavra) {
		return primeiraPalavra.toLowerCase().equals(segundaPalavra.toLowerCase());
	}

	@Override
	public boolean validarPalavras(String primeiraPalavra, String segundaPalavra) {
		boolean sucesso = false;

		if (palavraEstaCorreta(primeiraPalavra, segundaPalavra)) {
			computarPontos();
			sucesso = true;
		} else {
			computarErros();
			sucesso = false;
		}

		return sucesso;
	}
}

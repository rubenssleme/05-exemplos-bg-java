package com.br.rubensleme.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.br.rubensleme.dominio.MecanicaDoJogoSimples;

public class TesteMecanicaDoJogo {

	@Test
	public void testePalavraValidadaComSucesso() {
		MecanicaDoJogoSimples jogo = new MecanicaDoJogoSimples();
		assertTrue(jogo.validarPalavras("Rubens", "Rubens"));

	}
	@Test
	public void testePontuacaoDoJogo() {
		MecanicaDoJogoSimples jogo = new MecanicaDoJogoSimples();
		jogo.validarPalavras("Rubens", "Rubens");
		System.out.println(jogo.obterPontuacaoFinal());
		assertEquals(1,jogo.obterPontuacaoFinal());

	}
	@Test
	public void testePontuacaoMaximaDoJogo() {
		MecanicaDoJogoSimples jogo = new MecanicaDoJogoSimples();
		
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			System.out.println(jogo.obterPontuacaoFinal());
		
		assertEquals(10,jogo.obterPontuacaoFinal());

	}
	
	@Test
	public void testeMaximoDeErrosPermitido() {
		MecanicaDoJogoSimples jogo = new MecanicaDoJogoSimples();
		
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
			jogo.validarPalavras("Rubens", "Rubens");
		
		assertEquals(true,jogo.fimDeJogo());

	}


}

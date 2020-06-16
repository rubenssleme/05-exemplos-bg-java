package com.br.rubensleme.controlador;

import java.util.Scanner;

import com.br.rubensleme.dominio.IMecanicaDoJogo;
import com.br.rubensleme.dominio.fabrica.FabricaMecanicaDoJogo;
import com.br.rubensleme.dominio.utilitario.BancoDePalavras;

public class Principal {

	@SuppressWarnings("resource")
	private static String efetuarLeitura() {
		System.out.println("Informe a palavra: ");
		return new Scanner(System.in).nextLine();
	}

	public static void main(String[] args) {
		System.out.println("[Jogo das Palavras Embaralhadas]");
		
		IMecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.obterMecanicaDoJogoSimples();

		do {
			String palavraAleatoria = BancoDePalavras.obterPalavraAleatoria();
			String palavraEmbaralhada = mecanicaDoJogo.obterEmbaralhador().embaralhar(palavraAleatoria);

			System.out.println("Palavra Embaralhada: " + palavraEmbaralhada);

			String palavraDigitada = efetuarLeitura();

			if (mecanicaDoJogo.validarPalavras(palavraAleatoria, palavraDigitada)) {
				System.out.println("Voce acertou e ganhou 1 ponto. ");
			} else {
				System.out.println("Errou! Perdeu 1 ponto! ");
			}

		} while (!mecanicaDoJogo.fimDeJogo());

		System.out.println("Pontuacao Final: " + mecanicaDoJogo.obterPontuacaoFinal());
	}

}

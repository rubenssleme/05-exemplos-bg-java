package com.br.rubensleme.dominio.utilitario;

import java.util.Random;

public class NumeroUtils {

	public static int gerarNumeroAleatorio(int numeroMaximo) {
		return new Random().nextInt(numeroMaximo);
	}

}

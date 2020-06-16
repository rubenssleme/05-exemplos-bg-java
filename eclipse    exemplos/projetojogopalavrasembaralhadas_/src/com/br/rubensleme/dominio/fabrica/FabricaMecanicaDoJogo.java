package com.br.rubensleme.dominio.fabrica;

import com.br.rubensleme.dominio.IMecanicaDoJogo;
import com.br.rubensleme.dominio.MecanicaDoJogoSimples;

public class FabricaMecanicaDoJogo {

	public static IMecanicaDoJogo obterMecanicaDoJogoSimples() {
		return new MecanicaDoJogoSimples();
	}

}

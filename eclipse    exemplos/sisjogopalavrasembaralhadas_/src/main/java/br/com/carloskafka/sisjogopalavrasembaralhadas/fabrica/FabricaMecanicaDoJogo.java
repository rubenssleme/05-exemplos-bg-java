package br.com.carloskafka.sisjogopalavrasembaralhadas.fabrica;

import br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.IMecanicaDoJogo;
import br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.MecanicaDoJogoSimples;

public class FabricaMecanicaDoJogo {

	public static IMecanicaDoJogo obterMecanicaDoJogoSimples() {
		return new MecanicaDoJogoSimples();
	}

}

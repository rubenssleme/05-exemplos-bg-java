package br.com.carloskafka.sisjogopalavrasembaralhadas.fabrica;

import java.util.Random;

import br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.embaralhadores.EmbaralhadorInverterPalavra;
import br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.embaralhadores.EmbaralhadorMisturarPalavra;
import br.com.carloskafka.sisjogopalavrasembaralhadas.dominio.embaralhadores.IEmbaralhador;

public class FabricaEmbaralhador {

	public static IEmbaralhador obterEmbaralhadorAleatorio() {
		int numeroAleatorio = new Random().nextInt(2);
		return numeroAleatorio == 2 ? new EmbaralhadorInverterPalavra() : new EmbaralhadorMisturarPalavra();
	}

}

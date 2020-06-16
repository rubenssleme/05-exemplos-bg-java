package com.br.rubensleme.dominio.fabrica;

import java.util.Random;

import com.br.rubensleme.dominio.embaralhador.EmbaralhadorInvertePalavra;
import com.br.rubensleme.dominio.embaralhador.*;

public class FabricaEmbaralhador {
	
	public static IEmbaralhador obterEmbaralhadorAleatorio(){
		int numeroAleatorio = new Random().nextInt(2);
		
		return numeroAleatorio == 2 ? new EmbaralhadorInvertePalavra() : new EmbaralhadorMisturarPalavra();
		
	}

}

package projetoviagem;

public class Viagem {
	
	
	private int distancia;
	private int combustivelGasto;
	
	
	//M�todo para calculo da distancia percorrida 
	void calculaDistancia(int tempoGasto, int velocidadeMedia){
		
		this.distancia = (tempoGasto*velocidadeMedia);
	}
	
	
	// M�todo que retorna a distancia percorrida
	int retornaDistancia(){
		
		return distancia;
	}
	
	
	
	void calculaGastoCombustivel(int distancia){
		this.combustivelGasto =(distancia / 12);
	}
	
	
	int retornaCombustivelGasto(){
		
		return combustivelGasto;
	}

}

package programandoViagem;

public class CalculaCombustivel {

	//autom�vel que faz 12 Km por litro
	private static int FAZ_POR_LITRO = 12;

	private int distanciaPercorrida;
	private int litrosCombustivel;


	//M�todo para calculo do combustivel
	void calculaDistanciaPercorrida(int tempoGasto, int velocidadeMedia){
		//TempoGasto em horas e velocidadeMedia em KM/h
		this.distanciaPercorrida = (tempoGasto * velocidadeMedia);

	}

	//M�todo para retorno da distancia percorrida .
	int getDistanciaPercorrida(){
		return distanciaPercorrida;
	}


	//M�todo para  calcular  litros
	void calculaLitrosCombustivel(int distanciaPercorrida){
		this.litrosCombustivel = (distanciaPercorrida/FAZ_POR_LITRO);
	}

	int getLitrosCombustivel(){
		return litrosCombustivel;
	}






}

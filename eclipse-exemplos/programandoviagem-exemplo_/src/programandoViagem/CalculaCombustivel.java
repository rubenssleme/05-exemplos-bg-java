package programandoViagem;

public class CalculaCombustivel {

	//automóvel que faz 12 Km por litro
	private static int FAZ_POR_LITRO = 12;

	private int distanciaPercorrida;
	private int litrosCombustivel;


	//Método para calculo do combustivel
	void calculaDistanciaPercorrida(int tempoGasto, int velocidadeMedia){
		//TempoGasto em horas e velocidadeMedia em KM/h
		this.distanciaPercorrida = (tempoGasto * velocidadeMedia);

	}

	//Método para retorno da distancia percorrida .
	int getDistanciaPercorrida(){
		return distanciaPercorrida;
	}


	//Método para  calcular  litros
	void calculaLitrosCombustivel(int distanciaPercorrida){
		this.litrosCombustivel = (distanciaPercorrida/FAZ_POR_LITRO);
	}

	int getLitrosCombustivel(){
		return litrosCombustivel;
	}






}

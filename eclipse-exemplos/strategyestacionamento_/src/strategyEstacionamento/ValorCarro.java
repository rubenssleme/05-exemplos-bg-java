package strategyEstacionamento;

public class ValorCarro implements Valor {

	@Override
	public double calculaValor(int tempo) {
			return tempo * 10.25;
	}

}

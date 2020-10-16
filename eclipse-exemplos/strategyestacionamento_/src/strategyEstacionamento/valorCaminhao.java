package strategyEstacionamento;

public class valorCaminhao implements Valor{

	@Override
	public double calculaValor(int tempo) {
		return ((tempo * 10.25)*3);
	}

}

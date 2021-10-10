package strategyEstacionamento;



public class Automovel {

	public static final int CAMINHAO = 1;
	public static final int CARRO = 2;

	String ValorASerPago;
	int tempo ;
	int tipo;
	protected Valor calculaValor;

	public Automovel(int tempo, int tipo){
		this.tempo = tempo;
		switch (tipo){
		case CAMINHAO:
			calculaValor = new ValorCarro() ;	
			break;
		case CARRO:
			calculaValor = new valorCaminhao() ;
			break;

		default:
			throw new RuntimeException("Carro não encontrado :/");
		}
	}


	private double obterValor(){
		return  calculaValor.calculaValor(tempo);
	}

	public void exibirValor(){
		System.out.println("O valor do estaciona é: " + obterValor());
	}


}

package exemploTellDontAsk;

public class TellDontAsk {
	// "Diga, n�o pergunte".
	Soma soma = new Soma();
	Double retornaSoma = soma.calculaSoma();
	private String retornavalorSoma() {
		return String.valueOf(retornaSoma);
	}
	

	public void imprimiOperacao() {
		System.out.println("Soma: " + retornavalorSoma());
	}
	
	
}


public class Principal {

	public static void main(String[] args) {
	ContaCorrente contaCorrente  = new ContaCorrente();
	double valorCreditar = 50.0;
	double valorDebitar = 80.0;
	
	contaCorrente.creditar(valorCreditar);
	
	//contaCorrente.debitar(valorDebitar);
	
	contaCorrente.debitarValidado(valorDebitar);
	System.out.println(contaCorrente.toString());

	}

}

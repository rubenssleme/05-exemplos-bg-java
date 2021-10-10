package controleBancario;


public class GerenciadorContas {

	private double saldoTotal;

	public GerenciadorContas() {
	}

	public GerenciadorContas(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void totalizarSaldo(Conta conta[]){
		this.setSaldoTotal(0.0);

		for(int i = 0; i < conta.length ; i++ ){
			System.out.println("\nConta: " + conta[i].getClass().getName() + 
			"\nSaldo da Conta: " + conta[i].getSaldo());
			if(i==0){
				saldoTotal = saldoTotal + conta[i].getSaldo();
			}else {
				saldoTotal = saldoTotal + conta[i].getSaldo();
			}

		}

		System.out.println( "\nTotal saldo: " + this.getSaldoTotal());

	}




}

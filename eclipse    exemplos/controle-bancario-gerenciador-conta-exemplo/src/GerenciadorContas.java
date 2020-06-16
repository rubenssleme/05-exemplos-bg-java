
public class GerenciadorContas {

	private double saldoTotal;

	public GerenciadorContas(){
		this(0.0);
	}
	public GerenciadorContas(double saldoTotal){
		this.saldoTotal = saldoTotal;
	}

	public void totalizarSaldo(Conta cont){
		saldoTotal = saldoTotal + cont.getSaldo();

	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

}

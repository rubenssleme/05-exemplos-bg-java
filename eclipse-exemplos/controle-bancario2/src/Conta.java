
public class Conta {
	private double saldo;

	public Conta() {

	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}

	public void creditar(double valor) {
		this.saldo = this.getSaldo() + valor;
	}

	public void debitar(double valor) {

		this.saldo = (this.getSaldo() - valor);

	}

	public void debitarValidado(double valor) {

		if (this.saldo >= valor) {
			this.saldo = (this.getSaldo() - valor);
		} else {
			System.out.println("saldo insuficiente = " + this.getSaldo());
		}

	}

}

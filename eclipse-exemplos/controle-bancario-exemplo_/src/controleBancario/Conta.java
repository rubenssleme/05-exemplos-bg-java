package controleBancario;

public abstract class Conta {


	// atributos
	protected double saldo;

	// contrutor zerado 
	public Conta(){
		
	}

	//contrutor com valores 
	public Conta(double saldo){
		this.saldo = saldo;
	}
	// getters e setters

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}

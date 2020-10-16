package bancoBG;

import javax.swing.JOptionPane;

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
	public void creditar(double valor){

		this.setSaldo(this.getSaldo()+ valor);		
	}

	public void debitar(double valor){
		
		if(this.getSaldo() >= valor){
			this.setSaldo(this.getSaldo() - valor);		
		}else{
			JOptionPane.showMessageDialog(null, "Saldo insuficiente" + this.getSaldo());
		}
	}
}

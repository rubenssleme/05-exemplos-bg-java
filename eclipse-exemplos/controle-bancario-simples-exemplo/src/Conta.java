import javax.swing.*;

public class Conta {

	// atributos
	private double saldo;

	// contrutor zerado 
	public Conta(){
		this(0.0);
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

	//metodos 

	public void creditar(double valor){
		this.setSaldo(this.getSaldo()+ valor);
		JOptionPane.showMessageDialog(null,"Valor creditado com sucesso!!! ");

	}

	public void debitar(double valor){

		if (this.getSaldo()>= valor){
			this.setSaldo(this.getSaldo() - valor );
		}else 
			JOptionPane.showMessageDialog(null,"Seu saldo é: " + String.valueOf(this.getSaldo()));
	}
	public void atualizarSaldo(){
		if (this.getSaldo()<= 0){
			double valorJuros = (this.getSaldo()*0.08);
			JOptionPane.showMessageDialog(null,"Saldo negativo e juros: " + String.valueOf(valorJuros));

		}

	}
}


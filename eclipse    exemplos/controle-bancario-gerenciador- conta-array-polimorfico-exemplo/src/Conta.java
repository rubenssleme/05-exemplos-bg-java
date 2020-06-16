import javax.swing.*;

abstract class Conta {

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
		// double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a creditar: "));
		this.setSaldo(this.getSaldo()+ valor);
		JOptionPane.showMessageDialog(null,"Valor creditado com sucesso!!! ");

	}

	public void debitar(double valor){

		// double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a debitar: "));
		if (this.getSaldo()>= valor){
			this.setSaldo(this.getSaldo() - valor );
		}else 
			JOptionPane.showMessageDialog(null,"Seu saldo é: " + String.valueOf(this.getSaldo()));
			
			//
		//JOptionPane.showMessageDialog(null,"Valor debitado com sucesso!!! ");
		//}//else{
		//JOptionPane.showMessageDialog(null,"Voce não tem saldo suficiente para isso!!!");	
		//}
	}
	abstract void atualizarSaldo();
		
		

	}



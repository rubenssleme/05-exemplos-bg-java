import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{

	// atributos
	private double limiteCredito;

	//contrutor zerado 
	public ContaCorrente(){

	}

	//contrutor com valor 
	public ContaCorrente(double saldo, double limiteCredito){
		super();
		this.limiteCredito = limiteCredito;

	}
	// getters e setters
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	public void sacarLimiteEspecial(double valor){
		if ((this.getLimiteCredito()>= valor)&& (this.getLimiteCredito()<= this.getLimiteCredito())) {
			this.setLimiteCredito(this.getLimiteCredito()-valor);
			this.setSaldo(this.getSaldo()-valor);
			JOptionPane.showMessageDialog(null,"Valor debitado com sucesso!!! ");
			JOptionPane.showMessageDialog(null,"Seu limite é de : R$ " + String.valueOf(this.getLimiteCredito()));

		} else{
			JOptionPane.showMessageDialog(null,"Seu limite de cretido é: R$ " + String.valueOf(this.getLimiteCredito()) + " insuficiente para esta transação!!!");
		}

	}

	
	public boolean checarSaldoInsuficiente(double valor){
		if ((this.getSaldo() == 0.0) || (this.getSaldo() < valor)){
			return true;
		}else {
			return false;
		}
	}


	public void debitarValor(double valor){
			this.setSaldo(this.getSaldo() - valor );
			JOptionPane.showMessageDialog(null,"Valor debitado com sucesso!!! ");
	}

	//Debitar usando limite especial. 	
	public void sacar(double valor){

		if (checarSaldoInsuficiente(valor)){
			JOptionPane.showMessageDialog(null,"Seu saldo é: R$ " + this.getSaldo() +  " insuficiente para esta transação!!! O valor será debitado de seu Limite");
			sacarLimiteEspecial(valor);	
		}else{ 
			debitarValor(valor);
			JOptionPane.showMessageDialog(null,"Seu saldo atual é: R$ " + String.valueOf(this.getSaldo()));

		}

	}


}

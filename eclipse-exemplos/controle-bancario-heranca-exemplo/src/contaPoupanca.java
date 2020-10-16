
public class contaPoupanca extends Conta {
	
	//atributos 
	private double reajusteMensal;
	
	// contrutores sem valor 
	public contaPoupanca(){
		this(0.0,0.0);
	}
	// contrutores com valores
	public contaPoupanca(double saldo, double preajusteMensal){
		super(saldo);
		this.reajusteMensal = preajusteMensal;
		
	}
// getter e setter 
	public double getReajusteMensal() {
		return reajusteMensal;
	}
	public void setReajusteMensal(double preajusteMensal) {
		this.reajusteMensal = preajusteMensal;
	}
	

public void atualizarSaldo(){
	
}

}


public class contaPoupanca extends Conta {
	
	//atributos 
	private double reajusteMensal;
	
	// contrutores sem valor 
	public contaPoupanca(){
		this(0.0,0.0);
	}
	// contrutores com valores
	public contaPoupanca(double saldo, double reajusteMensal){
		super(saldo);
		this.reajusteMensal = reajusteMensal;
		
	}
// getter e setter 
	public double getReajusteMensal() {
		return reajusteMensal;
	}
	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}
	

public void atualizarSaldo(){
	
}

}

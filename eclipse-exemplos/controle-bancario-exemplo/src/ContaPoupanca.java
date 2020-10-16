import javax.swing.JOptionPane;


public class ContaPoupanca extends Conta implements iConta {

	//atributos 
	private double reajusteMensal;

	// contrutores sem valor 
	public ContaPoupanca(){
		this(0.0,0.0);
	}
	// contrutores com valores
	public ContaPoupanca(double saldo, double reajusteMensal){
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
		if (this.getSaldo()<= 0){
			double valorJuros = (this.getSaldo()*0.08);
			JOptionPane.showMessageDialog(null,"Saldo negativo e juros: " + String.valueOf(valorJuros));

		}

	}
	@Override
	public String consultaSaldo() {
		return  String.valueOf(this.getSaldo());
	}
	@Override
	public String consultaExtrato() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

import javax.swing.JOptionPane;

public class contaCorrente extends Conta {

	// atributos
	private double limiteEspecial;

	//contrutor zerado 
	public contaCorrente(){
		this(0.0,0.0);
	}

	//contrutor com valor 
	public contaCorrente(double saldo, double plimiteEspecial){
		super(saldo);
		this.limiteEspecial = plimiteEspecial;

	}
	// getters e setters
	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public void debitar(double valor){

		// double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a debitar: "));
		if (this.getSaldo()+ this.getLimiteEspecial()>= valor){
			this.setSaldo(this.getSaldo()- valor);
		} else{
			JOptionPane.showMessageDialog(null,"Seu saldo negativo é: " + String.valueOf(this.getSaldo()- limiteEspecial));
		}

	}





}

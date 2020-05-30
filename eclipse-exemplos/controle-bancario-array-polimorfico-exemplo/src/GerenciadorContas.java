import javax.swing.JOptionPane;


public class GerenciadorContas {

	private double saldoTotal;

	public GerenciadorContas(){
		this(0.0);
	}
	public GerenciadorContas(double saldoTotal){
		this.saldoTotal = saldoTotal;
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void totalizarSaldo(Conta cont[]){
		this.setSaldoTotal(0.0);
		for (int i = 0; i < cont.length ; i++) {
			JOptionPane.showMessageDialog(null, "Conta: " + cont[i].getClass().getName() 
			+ "\nPreço de custo: " + cont[i].getSaldo());
			this.setSaldoTotal(this.saldoTotal += cont[i].getSaldo());
		}
		JOptionPane.showMessageDialog(null, "Total saldo: " + this.getSaldoTotal());
			//saldoTotal = saldoTotal + cont.getSaldo(0);

	}

}

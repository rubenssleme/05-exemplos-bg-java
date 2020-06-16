import javax.swing.JOptionPane;


public class ContaPoupanca extends Conta{

	private double reajusteMensal;

	public ContaPoupanca()
	{
		this(0d,0d);
	}
	public ContaPoupanca(double saldo, double reajusteMensal)
	{
		super(saldo);
		this.reajusteMensal=reajusteMensal;
	}
	public void setReajusteMensal(double reajusteMnsal)
	{
		this.reajusteMensal = reajusteMnsal;
	}
	public double getReajusteMensal()
	{
		return reajusteMensal;
	}
	public void atualizarSaldo(double reajuste)
	{
		double x = this.getSaldo();
		this.setSaldo(this.getSaldo()+(this.getSaldo()*reajuste));
		this.setReajusteMensal(reajuste);
		JOptionPane.showMessageDialog(null, "Saldo Anterior: "+
				x+"\nSaldo Atual: "+this.getSaldo());
	}
}

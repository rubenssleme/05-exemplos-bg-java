import javax.swing.JOptionPane;


public class ContaCorrente extends Conta{

	private double limiteEspecial;

	public ContaCorrente()
	{
		this(0d,0d);
	}
	public ContaCorrente(double saldo, double limiteEspecial)
	{
		super(saldo);
		this.limiteEspecial=limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial)
	{
		this.limiteEspecial=limiteEspecial;
	}
	public double getLimiteEspecial()
	{
		return limiteEspecial;
	}
	public void debitar(double valor)
	{
		if ((this.limiteEspecial+this.getSaldo())>=valor)
		{
			this.setSaldo(this.getSaldo()-valor);
			JOptionPane.showMessageDialog(null, "Valor sacado com sucesso!");
		}else
		{
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
		}
	}

}

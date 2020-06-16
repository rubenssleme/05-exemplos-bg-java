import javax.swing.JOptionPane;

public class Conta {

	private double saldo;

	public Conta()
	{
		this(0);
	}

	public Conta(double saldo)
	{
		this.saldo=saldo;
	}
	public void setSaldo(double saldo)
	{
		this.saldo=saldo;
	}
	public double getSaldo()
	{
		return saldo;
	}
	public void creditar(double valor)
	{
		if (valor>0)
		{
			this.setSaldo(this.getSaldo()+valor);
			JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!");
		}else
		{
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}
	}
	public void debitar(double valor)
	{
		if (this.getSaldo()>=valor)
		{
			this.setSaldo(this.getSaldo()-valor);
			JOptionPane.showMessageDialog(null, "Valor sacado com sucesso!");
		}else
		{
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
		}
	}
	public void atualizarSaldo()
	{
		if (this.getSaldo()<0)
		{
			double ant = this.getSaldo();
			this.setSaldo(this.getSaldo()-(this.getSaldo()*0.08));
			JOptionPane.showMessageDialog(null,"Saldo Anterior: "+ant+
					"\nSaldo Atual: "+this.getSaldo());
		}
	}
}

import javax.swing.JOptionPane;
public class Calculadora {
	private double n1;
	private double n2;
	private double result;

	public Calculadora()
	{
		this(0d,0d,0d);
	}
	public Calculadora(double n1,double n2, double result)
	{
		this.n1=n1;
		this.n2=n2;
		this.result=result;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void somar()
	{
		this.setResult(this.getN1()+this.getN2());
	}
	public void subtrair(double a, double b)
	{
		this.setResult(a - b);
	}
	public void multiplicar()
	{
		this.setResult(this.getN1() * this.getN2());
	}
	public boolean dividir(double a, double b)
	{
		if (b != 0) 
		{
			this.setResult(a / b);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void leDados()
	{
		this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")));
		this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ")));
	}
	
	
	
	public void exibirResultado()
	{
		JOptionPane.showMessageDialog(null,"Resultado: " + String.valueOf(this.getResult()));
	}
}

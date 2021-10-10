import javax.swing.JOptionPane;
public class Triangulo {
	
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo()
	{
		
	}
	public Triangulo(double lado1,double lado2,double lado3)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public String nomeTriangulo(){
		String retorno = "N�o � Tri�ngulo";
		if (this.eTriangulo())
		{
			if ((this.getLado1() == this.getLado2()) && (this.getLado2() == this.getLado3()))
			{
				retorno = "Equil�tero";
			}
			else
			{
				if (((this.getLado1() == this.getLado2()) && (this.getLado2() != this.getLado3())) ||
						((this.getLado1() == this.getLado3()) && (this.getLado2() != this.getLado3())) ||
						((this.getLado2() == this.getLado3()) && (this.getLado1() != this.getLado3())))
				{
					retorno = "Is�celes";
				}
				else
				{
					retorno = "Escaleno";
				}
			}
		}
		return retorno;
	}
	
	public void calculaPerimetro()
	{
		if (this.eTriangulo())
		{
			JOptionPane.showMessageDialog(null, "O per�metro do Tri�ngulo " + this.nomeTriangulo() + " � de " 
					+ String.valueOf(this.lado1 + this.lado2 + this.lado3) + " .");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "N�o � tri�ngulo.");
		}
	}
	public void leLados()
	{
		this.setLado1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro lado do Tri�ngulo: ")));
		this.setLado2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo lado do Tri�ngulo: ")));
		this.setLado3(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro lado do Tri�ngulo: ")));
	}
	public boolean eTriangulo()
	{
		boolean retorno = false;
		if (((this.getLado1() + this.getLado2()) > this.getLado3()) &&
				((this.getLado3() + this.getLado2()) > this.getLado1()) &&
				((this.getLado1() + this.getLado3()) > this.getLado2()))
		{
			retorno = true;
		}
		return retorno;
	}
}

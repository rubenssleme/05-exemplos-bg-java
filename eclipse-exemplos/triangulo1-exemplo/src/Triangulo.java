
public class Triangulo {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	
	
	public Triangulo() {
		
	}






	public Triangulo(double lado1, double lado2, double lado3) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}






	
	// Metodos
	
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






	private boolean eTriangulo(){
		boolean retorno  = false;
		
		if(((this.getLado1()+this.getLado2()) > this.getLado3())&&
		((this.getLado3()+this.getLado1()) > this.getLado2())&&
		((this.getLado2()+this.getLado3()) > this.getLado1()))
		{
			retorno = true;
		}
	
	return retorno;	
	}
	
	public String  nomeTriangulo(){
		
		
		
		
	return "";
	}
	
	

}

import java.util.Scanner;




public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo()
	{
		this(0d,0d,0d);
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

	// Metodo de calculo do perimetro 
	
	public void calculaPerimetro() 	{
		double lado1, lado2, lado3; // declaraçao de variaveis
		Scanner s = new Scanner(System.in);
		//atribuicao de valores para variaveis
		System.out.println("Digite o valor 1");
		lado1 = s.nextDouble();
		System.out.println("Digite o valor 2");
		lado2 = s.nextDouble();
		System.out.println("Digite o valor 3");
		lado3 = s.nextDouble();
		
		//atribuicao de valores para atributos
		
		this.setLado1(lado1);
		this.setLado2(lado2);
		this.setLado3(lado3);
		
		
			System.out.println("O perímetro do Triângulo  é de " + String.valueOf(this.lado1 + this.lado2 + this.lado3) + " .");

		

	}
}

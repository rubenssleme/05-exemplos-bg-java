package projetoOperadoresAritmeticos;

public class Calculadora {
	private Integer valor1;
	private Integer valor2;
	
	
	public Calculadora(Integer valor1, Integer valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}


	public Integer getValor1() {
		return valor1;
	}


	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}


	public Integer getValor2() {
		return valor2;
	}


	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	
	
	private Integer somarValores(int n1, int n2){
			return (n1+n2);
	}
	
	private void obterValores(){
		this.setValor1(valor1);
		this.setValor2(valor2);
	}
	
	public void exibirValores(){
		obterValores();
		System.out.println(somarValores(this.getValor1(), this.getValor2()));
	}
	
	
	

}

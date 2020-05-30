package somaDoisNumeros;

import javax.swing.JOptionPane;
public class Soma {
	//Atributos	
	private int valor1;
	private int valor2;
	private int resultadoSoma;

	//Construtores
	public Soma() {

	}

	public Soma(int valor1, int valor2, int resultadoSoma) {

		this.valor1 = valor1;
		this.valor2 = valor2;
		this.resultadoSoma = resultadoSoma;
	}

	//Getter e Setters
	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}
	
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public int getResultadoSoma() {
		return resultadoSoma;
	}

	public void setResultadoSoma(int resultadoSoma) {
		this.resultadoSoma = resultadoSoma;
	}

	//Metodos da classe Soma 
	
	public void somaValores(){
		recebeValoresEConverteParaInteiro();
		this.setResultadoSoma(this.getValor1()+ this.getValor2());

	}
	
	private void recebeValoresEConverteParaInteiro(){
		//recebe valores
		String valor1 = JOptionPane.showInputDialog("Digite o  valor 1");
		String valor2 = JOptionPane.showInputDialog("Digite o  valor 2");

		//converte valores para inteiro
		converteValoresParaInteiro(valor1,valor2);
	}

	private void converteValoresParaInteiro(String valor1, String valor2){
		this.setValor1(Integer.parseInt(valor1));
		this.setValor2(Integer.parseInt(valor2));
	}

	


}

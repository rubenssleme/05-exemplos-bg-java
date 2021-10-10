package somaDoisValores;

import javax.swing.JOptionPane;

public class Soma {

	//Atributos
	private int valor1;
	private int valor2;
	private int resultado;

	//Construtores
	public Soma() {

	}

	public Soma(int valor1, int valor2, int resultado) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.resultado = resultado;
	}

	//Getters e Setters
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

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	//Metodos da Classe

	public void somaValores(){
		receberValoresEConverterParaInteiros();
		this.setResultado(this.getValor1() + this.getValor2());
	}

	private void receberValoresEConverterParaInteiros(){
		//Receber os valores
		String valor1 = JOptionPane.showInputDialog("Digite o valor 1");
		String valor2 = JOptionPane.showInputDialog("Digite o valor 2");
		//Conversão de valores para inteiro
		converterValoresParaInteiro(valor1, valor2);
	}

	private void converterValoresParaInteiro(String valor1,String valor2){
		this.setValor1(Integer.parseInt(valor1));
		this.setValor2(Integer.parseInt(valor2));
	}





}

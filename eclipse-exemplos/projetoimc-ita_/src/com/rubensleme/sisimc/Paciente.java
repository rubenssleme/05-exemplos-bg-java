package com.rubensleme.sisimc;

public class Paciente {

	private double peso;
	private double altura;

	public Paciente() {

	}

	public Paciente(double peso, double altura) {

		this.peso = peso;
		this.altura = altura;
	}
	//Metodo que calcula o indice IMC e retorna e retorna o o valor ajustado para duas casas antes do ponto.
	public Classificacao calculaIMC(){
		double	imc = ((this.peso / (this.altura* this.altura)) * 10000);
		for (Classificacao c  : Classificacao.values()) {
			if((c.getFaixaFinal()>=imc)&&(c.getFaixaInicial()<=imc)){
			return	c;
			}
		}
		return null;
	}

	//Metodo diagnostico exibe na tela o diagnostico de cada paciente de acordo com seu indice IMC.
	public void diagnostico(){
		System.out.println("Seu IMC "+ calculaIMC().getDescricao() );
	}
		
			// Metodo  para formatação de saida de uma String
	public String formatacaoSaidaIMC(){
		String resultado = String.format("%.2f",  calculaIMC());
		return resultado;
	}


}

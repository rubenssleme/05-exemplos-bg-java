package com.br.etec.formatacaoSimples;

import java.text.DecimalFormat;

public class FormatacaoSimples {

	private static FormatacaoSimples instancia;
	
	public static String QUATRO_DIGITOS = "0000";
	public static String QUATRO_DIGITOS_FACULTATIVOS = "####";
	public static String QUATRO_DIGITOS_DOIS_DECIMAIS = "###.00";
	
	//Construtor privado
	private FormatacaoSimples(){
		
	}
	
	public static FormatacaoSimples getInstance(){
		if (instancia == null){
			instancia = new FormatacaoSimples();
		}
		return instancia;
	}
	
	public String formatar(String formato, double valor){
		DecimalFormat formatador = new DecimalFormat(formato);
		return formatador.format(valor);
	}
	
	public String formatar(String formato, long valor){
		DecimalFormat formatador = new DecimalFormat(formato);
		return formatador.format(valor);
	}	
}

package com.br.etec.formatacaoLocal;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoLocal {

	private static FormatacaoLocal instancia;
	
	//Construtor privado
	private FormatacaoLocal(){
		
	}
	
	public static FormatacaoLocal getInstance(){
		if (instancia == null){
			instancia = new FormatacaoLocal();
		}
		return instancia;
	}
	
	public String formatar(Locale local, double valor){
		NumberFormat formatador = DecimalFormat.getCurrencyInstance(local);
		return formatador.format(valor);
	}
	
	public String formatar(Locale local, long valor){
		NumberFormat formatador = DecimalFormat.getCurrencyInstance(local);
		return formatador.format(valor);
	}	
}

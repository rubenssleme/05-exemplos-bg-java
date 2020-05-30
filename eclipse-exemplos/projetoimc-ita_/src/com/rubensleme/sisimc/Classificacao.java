package com.rubensleme.sisimc;

public enum Classificacao {
	
	BAIXO_PESO_MUITO_GRAVE("Baixo peso muito grave.",0.0,16.0),
	BAIXO_PESO_GRAVE("Baixo peso grave.",16.01,16.99),
	BAIXO_PESO("Baixo peso.",17.01,18.49),
	PESO_NORMAL("Peso normal.",18.50,24.99),
	SOBREPESO("Sobrepeso",25.00, 29.99),
	OBESIDADE_GRAU_I("Obesidade grau I",30.00 , 34.99),
	OBESIDADE_GRAU_II("Obesidade grau II",35.00, 39.99),
	OBESIDADE_GRAU_III("Obesidade grau III",40.00, 100.00);
	
	
	private final String descricao;
	private final Double faixaInicial;
	private final Double faixaFinal;
	
	
	
	private Classificacao(String descricao, Double faixaInicial, Double faixaFinal) {
		this.descricao = descricao;
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}



	public String getDescricao() {
		return descricao;
	}



	public Double getFaixaInicial() {
		return faixaInicial;
	}



	public Double getFaixaFinal() {
		return faixaFinal;
	}
	
	
	

}

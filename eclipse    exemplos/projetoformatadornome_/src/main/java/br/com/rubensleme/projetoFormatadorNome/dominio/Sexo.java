package br.com.rubensleme.projetoFormatadorNome.dominio;

public enum Sexo {
	MASCULINO("Sr."), FEMININO("Sra.");

	private String tratativa;

	private Sexo(String nome) {
		this.tratativa = nome;
	}
	
	public String obterTratativa() {
		return tratativa;
	}
}

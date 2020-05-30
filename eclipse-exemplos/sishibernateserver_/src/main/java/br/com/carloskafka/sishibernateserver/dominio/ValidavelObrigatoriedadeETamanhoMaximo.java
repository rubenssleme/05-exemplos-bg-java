package br.com.carloskafka.sishibernateserver.dominio;

public interface ValidavelObrigatoriedadeETamanhoMaximo {
	public void validarObrigatoriedadeETamanhoMaximoDeDados();

	public boolean validado();

	public String obterDescricaoErros();
}

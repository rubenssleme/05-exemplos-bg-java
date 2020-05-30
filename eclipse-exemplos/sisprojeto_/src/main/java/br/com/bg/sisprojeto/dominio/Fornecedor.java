package br.com.bg.sisprojeto.dominio;

public class Fornecedor {
	private Long id;
	private String nome;
	private String nomeFantasia;
	private String cnpj;

	public Fornecedor() {
		this(0L, "", "", "");
	}

	public Fornecedor(Long id, String nome, String nomeFantasia, String cnpj) {
		this.id = id;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + ", nomeFantasia="
				+ nomeFantasia + ", cnpj=" + cnpj + "]";
	}

}

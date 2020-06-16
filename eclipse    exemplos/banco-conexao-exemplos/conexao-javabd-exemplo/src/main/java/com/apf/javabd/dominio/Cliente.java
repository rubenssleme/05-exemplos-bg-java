package com.apf.javabd.dominio;

public class Cliente {
	private Long id;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private String email;
	private String telefone;

	public Cliente() {
		this(0L, "", "", "", "", "");
	}

	public Cliente(Long id, String nome, String cnpj, String razaoSocial,
			String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.telefone = telefone;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cnpj=" + cnpj
				+ ", razaoSocial=" + razaoSocial + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}

}

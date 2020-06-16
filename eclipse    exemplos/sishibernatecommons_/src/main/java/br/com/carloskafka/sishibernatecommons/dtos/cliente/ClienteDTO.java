package br.com.carloskafka.sishibernatecommons.dtos.cliente;

import br.com.carloskafka.sishibernatecommons.Identificavel;
import br.com.carloskafka.sishibernatecommons.dtos.ModeloDTO;

public class ClienteDTO extends ModeloDTO implements Identificavel {

	private static final long serialVersionUID = 2053747659025992723L;

	private Long id;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private String email;
	private String telefone;

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

}

package com.aprendaefaca.gerCliente.modelos;

public class Pessoa {

	private int codigo;
	private String nome;
	private String endereco;
	private String complementeto;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
       
	
	public Pessoa() {
		this(0,"","","","","","","");
	}
	
	public Pessoa(int codigo, String nome, String endereco,	String complementeto, String bairro, String cidade, String estado, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.complementeto = complementeto;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
                
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplementeto() {
		return complementeto;
	}

	public void setComplementeto(String complementeto) {
		this.complementeto = complementeto;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
        
      
        

	
}

package com.aprendaefaca.gerCliente.modelos;

public class Cliente extends Pessoa{
	
	private String celular;
	private String cpf;
	private String rg;
	
	public Cliente(){
		this(0,"","","","","","","","","","");
	}

	public Cliente(int codigo, String nome, String endereco, String complementeto, String bairro, String cidade, String estado, String telefone, String celular, String cpf, String rg) {
		super(codigo, nome, endereco, complementeto, bairro, cidade, estado, telefone);
		this.celular = celular;
		this.cpf = cpf;
		this.rg = rg;
	}


	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}

package Modell;

public class Fornecedor extends Pessoa{
	
	private String telefone1;
	private String cnpj;
	private String contato;
	
	public Fornecedor(){
		this(0,"","","","","","","","","","");
	}

	public Fornecedor(int codigo, String nome, String endereco,	String complementeto, String bairro, String cidade, String estado, String telefone, String telefone1, String cnpj, String contato) {
		super(codigo, nome, endereco, complementeto, bairro, cidade, estado, telefone);
		this.telefone1 = telefone1;
		this.cnpj = cnpj;
		this.contato = contato;
	}


	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

}

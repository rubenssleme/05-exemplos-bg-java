package br.com.example.conexadocker.model;

public class Cliente {
	private String login;
	private String senha;
	private String nome;
    private String cpf;
    private String telefone;
    private String eMail;
    private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
    private String cep;

	public Cliente() {

	}

	public Cliente(String login, String senha, String nome, String cpf, String telefone, String eMail, String endereco, String bairro, String cidade, String uf, String cep) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.eMail = eMail;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"login='" + login + '\'' +
				", senha='" + senha + '\'' +
				", nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", telefone='" + telefone + '\'' +
				", eMail='" + eMail + '\'' +
				", endereco='" + endereco + '\'' +
				", bairro='" + bairro + '\'' +
				", cidade='" + cidade + '\'' +
				", uf='" + uf + '\'' +
				", cep='" + cep + '\'' +
				'}';
	}
}

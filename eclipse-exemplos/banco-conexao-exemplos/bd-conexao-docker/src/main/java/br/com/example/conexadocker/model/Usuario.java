package br.com.example.conexadocker.model;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String tipo;
	private String login;
	private String senha;
	
	public Usuario() {
	
	}

	public Usuario(int id, String nome, String email, String tipo, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
		this.login = login;
		this.senha = senha;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", tipo=" + tipo + ", login="
				+ login + ", senha=" + senha + "]";
	}
	
	
	
	
	
}

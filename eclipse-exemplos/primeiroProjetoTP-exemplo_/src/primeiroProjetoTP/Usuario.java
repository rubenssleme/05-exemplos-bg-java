package primeiroProjetoTP;

public class Usuario {
	//Atributos
	private String nome;
	private String eMail;
	private String login;
	private String senha;


	//Construtores

	public Usuario() {
	}


	public Usuario(String nome, String eMail, String login, String senha) {
		this.nome = nome;
		this.eMail = eMail;
		this.login = login;
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
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


	public void provarExistencia(){

		System.out.println("Oi eu Existo!!!");
	}






}

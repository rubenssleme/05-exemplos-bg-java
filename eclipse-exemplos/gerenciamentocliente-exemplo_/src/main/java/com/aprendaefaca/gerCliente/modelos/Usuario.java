package com.aprendaefaca.gerCliente.modelos;

public class Usuario {
        private int codigo;
	private String login;
	private String nome;
	private String senha;
        private String email;
	private String tipo;
	
	public Usuario(){
		this(0,"","","","","");
	}

	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
        public Usuario(int codigo,String nome, String login, String senha,String email, String tipo) {
                this(nome,login,senha);
                this.codigo = codigo;	
                this.email = email;
                this.tipo = tipo;
	}
        
        public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
          public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
        
        public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        

	
}

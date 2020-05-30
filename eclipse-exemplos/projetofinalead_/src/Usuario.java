
abstract class Usuario {
	private String nome;
	private String endereco;
	private String username;
	private int senha;
	private String email;


	public Usuario(){
		this("","","",0,"");
	}

	public Usuario(String nome,String endereco,String username,int senha,String email){
		this.nome = nome;
		this.endereco = endereco;
		this.username = username;
		this.senha = senha;
		this.email = email;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void cadastrar(String nome,String end,String username,int senha,String email){
		this.setNome(nome);
		this.setEndereco(end);
		this.setUsername(username);
		this.setSenha(senha);
		this.setEmail(email);
	}

	abstract String mostra();
		
	abstract boolean testarLogin();

	
}

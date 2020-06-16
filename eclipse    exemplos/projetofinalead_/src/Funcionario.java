
public class Funcionario extends Servidor{

	private int ramal;
	private String departamento;

	
	public Funcionario() {
		this(0,"","","",0,"",0,"");
	}

	public Funcionario(int matricula, String nome, String endereco,
			String username, int senha, String email, int ramal,
			String departamento) {
		super(matricula, nome, endereco, username, senha, email);
		this.ramal = ramal;
		this.departamento = departamento;
	}


	public int getRamal() {
		return ramal;
	}



	public void setRamal(int ramal) {
		this.ramal = ramal;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public void cadastrar(String nome,String end,String username,int senha,String email,String departameto){
		this.setNome(nome);
		this.setEndereco(end);
		this.setUsername(username);
		this.setSenha(senha);
		this.setEmail(email);
		this.setDepartamento(departameto);
	}


	@Override
	String mostra() {
		
		System.out.println(this.getNome());
		
		return null;
	}

	

	boolean testarLogin(String username,int senha) {
		if ((this.getUsername().equals(username))&& (this.getSenha()== senha)){
			return true;
			
		}else{
			return false;
		}
		
		
		 
	}
	


}

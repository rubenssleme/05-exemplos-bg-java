
public class Docente extends Servidor{
	
	private String disciplina;
		
	public Docente() {
		this(0,"","","",0,"","");
	}
	
	public Docente(int matricula, String nome, String endereco,
			String username, int senha, String email, String disciplina) {
		super(matricula, nome, endereco, username, senha, email);
		this.disciplina = disciplina;
	}


	


	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}






	public void cadastrar(String nome,String end,String username,int senha,String email,String disciplina){

		this.setNome(nome);
		this.setEndereco(end);
		this.setUsername(username);
		this.setSenha(senha);
		this.setEmail(email);
		this.setDisciplina(disciplina);

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

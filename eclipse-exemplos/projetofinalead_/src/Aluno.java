import javax.swing.JOptionPane;


public  class Aluno extends Usuario{

	private int  ra;
	private  String curso;
	
	public Aluno() {
		this(0,"","","","",0,"");
	}
	
	public Aluno(int ra, String curso,String nome,String endereco,String username,int senha,String email) {
		super(nome,endereco,username,senha,email);
		this.ra = ra;
		this.curso = curso;
	}
	

	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cadastrar(String nome,String end,String username,int senha,String email,int ra,String curso){
		this.setNome(nome);
		this.setEndereco(end);
		this.setUsername(username);
		this.setSenha(senha);
		this.setEmail(email);
		this.setRa(ra);
		this.setCurso(curso);

	}



	@Override
	String mostra() {
		
		JOptionPane.showMessageDialog(null,this.getNome());
		
		return null;
	}

	

	boolean testarLogin(String username,int senha) {
		if ((this.getUsername().equals(username))&& (this.getSenha()== senha)){
			return true;
			
		}else{
			return false;
		}
		
		
		 
	}



	@Override
	boolean testarLogin() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

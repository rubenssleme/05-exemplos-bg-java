
public  class Servidor  extends Usuario{
	private int matricula;

	public Servidor(int matricula,String nome,String endereco,String username,int senha,String email) {
		super(nome,endereco,username,senha,email);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	String mostra() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean testarLogin() {
		// TODO Auto-generated method stub
		return false;
	}
		

}

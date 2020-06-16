package classeCorreta;

public class Correta {

	private String nome;
	private int idade;


	public Correta(){
		this("",0);
	}

	public Correta(String nome,int idade){
		this.nome = nome;
		this.idade = idade;
				
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void provarExistencia(){
		System.out.println("Ola eu sou: " + getNome() + " tenho" + getIdade());
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

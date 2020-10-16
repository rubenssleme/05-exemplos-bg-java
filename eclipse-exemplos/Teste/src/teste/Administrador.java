package teste;

public class Administrador {
	private String nome;
	private int idade;
	private boolean adm;
	
	public Administrador() {
	
	}

	public Administrador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.adm = true;
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

	public boolean isAdm() {
		return adm;
	}

	public void setAdm(boolean adm) {
		this.adm = adm;
	}

	@Override
	public String toString() {
		return "Administrador [nome=" + nome + ", idade=" + idade + ", adm=" + adm + "]";
	}
	
}

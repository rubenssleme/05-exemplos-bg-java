import javax.swing.JOptionPane;

public class Pokemon {

	//declara�ao de Atributos 
	private String nome;
	private String cor;
	private int forca;
	private String poderes;
	
	// Contrutores  
	public Pokemon(){
		this("","",0,"");
	}

	public Pokemon(String nome, String cor, int forca, String poderes) {
		this.nome = nome;
		this.cor = cor;
		this.forca = forca;
		this.poderes = poderes;
	}
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public String getPoderes() {
		return poderes;
	}

	public void setPoderes(String poderes) {
		this.poderes = poderes;
	}
// Metodos da Classe
	
	public void atacarPokemon(){
	System.out.println("Ataque de Força " + this.getForca());	
	}
	
	public void defesaPokemon(){
		System.out.println("Defesa de Força " + this.getForca());	
	}
	



}

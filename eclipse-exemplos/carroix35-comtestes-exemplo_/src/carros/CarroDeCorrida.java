package carros;

public abstract class CarroDeCorrida {

	

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome, int velocidadeMaxima ) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}

	public abstract void acelerar() ;
	
	public  int getVelocidade(){
		return velocidade;	
	}
	
	public String getNome() {
		return nome;
	}

	public void frear() {
		velocidade = velocidade /2;
	}

}

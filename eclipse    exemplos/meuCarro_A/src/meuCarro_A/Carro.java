package meuCarro_A;

public class Carro {
	//Declaração de Atributos 
	private String marca; 
	private boolean ligado;
	private int velocidade; 
	private int marcha;

	//Declaração dos Construtores
	public Carro() {

	}

	public Carro(String marca, boolean ligado, int velocidade, int marcha) {
		this.marca = marca;
		this.ligado = ligado;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	//Metodos do sistema  programados pelo alunos.

	public void ligarCarro() {

		if(this.ligado == true) {
			System.out.println("O Carro esta ligado");
		}else {
			System.out.println("O Carro esta desligado");
		}


	}






}

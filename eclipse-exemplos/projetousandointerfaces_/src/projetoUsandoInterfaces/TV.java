package projetoUsandoInterfaces;

public abstract class TV implements ControleRemoto {
	private int tamanho;
	private int canal;
	private int volume;
	private boolean ligada;

	public TV(int tamanho) {

		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
		this.ligada = false;

	}

	
	@Override
	public void mudarCanal(int canal) {
	
		
	}

	@Override
	public void aumentarVolume(int taxa) {
		
	}

	@Override
	public void diminuirVolume(int taxa) {
		
	}

	@Override
	public boolean ligar() {
		return false;
	}
	public boolean ligar(Boolean ligada) {
		return this.ligada = ligada;
	}

	@Override
	public boolean desligar() {
		return false;
	}
	
	
	

}

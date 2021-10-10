package projetoUsandoInterfaces;

public class ModeloTVComum extends TV {

	public ModeloTVComum(int tamanho) {
		super(tamanho);
		
	}

	@Override
	public void mudarCanal(int canal) {
		super.mudarCanal(canal);
	}

	@Override
	public void aumentarVolume(int taxa) {
		super.aumentarVolume(taxa);
	}

	@Override
	public void diminuirVolume(int taxa) {
		super.diminuirVolume(taxa);
	}

	@Override
	public boolean ligar() {
		return super.ligar();
	}

	@Override
	public boolean desligar() {
		return super.desligar();
	}
	
	

}

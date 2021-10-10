package projetoUsandoInterfaces;

public class ModeloTVSDX extends TV {

	public ModeloTVSDX(int tamanho) {
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
	
	public boolean ligar(Boolean ligada) {
		return super.ligar(ligada);
	}

	@Override
	public boolean desligar() {
		return super.desligar();
	}
	
	

}

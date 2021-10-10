package strategyRubens;

public class Animal  {

	public static final int LEAO = 1;
	public static final int GATO = 2;
	
	public int tipo;
	public String somEmitido;
	
	protected EmitirSom emitirSom;
	
	public  Animal(int tipo, String somEmitido){
		this.somEmitido = somEmitido;
		switch (tipo){
		case LEAO:
			emitirSom = new AnimalConcreto();
			break;
		case GATO:
			emitirSom = new AnimalConcreto();
			break;
			
		default:
			throw new RuntimeException("Animal não encontrado :/");
		}
		
	}
	
	
	public String emitindoSom() {
		return emitirSom.somEmitido(this);
		
	}

	public String getSomEmitido() {
		return somEmitido;
	}

	public int getTipo() {
		return tipo;
	}
	
	
	
}

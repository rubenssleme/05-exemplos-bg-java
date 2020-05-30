
public class Principal {

	public static void main(String[] args) {

		IBarulhento[] barulhentos  = new IBarulhento[4];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Carro();
		barulhentos[2] = new Cachorro();
		barulhentos[3] = new Carro();
		fazBarulho(barulhentos);
	}

	public static void fazBarulho(IBarulhento[] barulhentos){
		for(IBarulhento b : barulhentos){
			System.out.println(b.emiteSom());
		}
	}
}

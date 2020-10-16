
public class Principal {
	public static void main(String[] args) {

		IPersonalidade[] barulhentos  = new IPersonalidade[2];
			
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Gato();
		
		fazBarulho(barulhentos);
	}
	
	public static void fazBarulho(IPersonalidade[] personalidade){
		for(IPersonalidade b : personalidade){
			System.out.println(b.som());
		}
	}
}

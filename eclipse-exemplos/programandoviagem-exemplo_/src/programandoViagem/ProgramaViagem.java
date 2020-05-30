package programandoViagem;

public class ProgramaViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculaCombustivel hondaCivic = new CalculaCombustivel();
		
		hondaCivic.calculaDistanciaPercorrida(3, 100);
		
		System.out.println("Seu carro percorreu "+ hondaCivic.getDistanciaPercorrida() + " Kilometros");
		
		hondaCivic.calculaLitrosCombustivel(hondaCivic.getDistanciaPercorrida());
		System.out.println("Quantidade de litros de combustível utilizada na viagem ("+ 
		hondaCivic.getLitrosCombustivel()+ " Litros).");
		
		
	}

}

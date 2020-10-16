package strategyRubens;

public class Principal {

	public static void main(String[] args) {

		Animal leao = new Animal(Animal.LEAO,"Roar! rawww! – rugido");

		System.out.println(leao.emitindoSom());


		Animal gato = new Animal(Animal.GATO,"Miauuuu");

		System.out.println(gato.emitindoSom());

		Animal cachorro = new Animal(3,"Miauuuu");

		System.out.println(cachorro.emitindoSom());



	}

}

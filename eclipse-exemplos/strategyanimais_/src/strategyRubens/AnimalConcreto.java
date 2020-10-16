package strategyRubens;

public class AnimalConcreto implements EmitirSom {

	
	@Override
	public String somEmitido(Animal umAnimal) {
		if (umAnimal.getTipo() == 1) {
			
			return umAnimal.getSomEmitido();
		}
		return umAnimal.getSomEmitido();
		
		
		
	}

}

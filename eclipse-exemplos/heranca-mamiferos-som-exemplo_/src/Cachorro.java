


public class Cachorro extends Mamifero{
	private char genero;
	Sons som = new Sons();

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
// Método Latir
			
	public void  latir(boolean l){
		
		if (l == true){
			somAnimail(som.CACHORRO_LATINDO);
		}else{
			System.out.println("zZZZZZZZZZ");
		}
		
	}
	
	

	  
	}
	
	
	

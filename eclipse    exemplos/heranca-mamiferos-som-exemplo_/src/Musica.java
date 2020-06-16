
public class Musica extends Mamifero {
	
	Sons som = new Sons();
	
	
	
public void  tocaMusica(boolean l){
		
		if (l == true){
			somAnimail(som.MUSICA_TOCANDO);
		}else{
			System.out.println("zZZZZZZZZZ");
		}
		
	}

}

package projetoNumerosRandomicos;
import java.util.Random;

public class NumerosRandomicos {
	private int numeroAleatorio;
	Random numero = new  Random(10);
	public NumerosRandomicos() {
		for(int i=0; i<10;i++){
			System.out.println(numero.nextInt());
		}
	}

}

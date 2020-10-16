package projetoNumerosRandomicos;

import java.util.Random;
public class NovoArray {
	Random r = new  Random(); 
	int i = 0;

	public NovoArray(){
		i =	r.nextInt(10);
		String[] cartas = {"As","Dois","Tres","Quatro"
				,"Cinco","Seis","Sete","Oito","Nove","Dez"};
		System.out.println(cartas[i]);
	}
}




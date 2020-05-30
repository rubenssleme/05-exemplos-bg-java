import java.util.Arrays;

import javax.swing.JOptionPane;


public class ArraySimples {

	public static void main(String[] args) {
		
		//Criamos e inicializamos nosso Array de Paises  
		String paises[]={"Brasil", "Russia","India","China", "Africa do Sul"};
		
		//Chave e Valor = indice
		int[] pares = new int[3];
		pares[0]=2;
		pares[1]=4;
		pares[2]=6;
		
		
		//acesso ao elemento do Array
		
		System.out.println(paises[0] + "\n" + paises[1]);
		System.out.println("Tamanho "+pares.length);
		System.out.println(Arrays.toString(pares));
		
		int posicao = Arrays.binarySearch(paises, "China");
		
		Arrays.sort(paises,0,paises.length);
		System.out.println(Arrays.toString(paises));

	}

}

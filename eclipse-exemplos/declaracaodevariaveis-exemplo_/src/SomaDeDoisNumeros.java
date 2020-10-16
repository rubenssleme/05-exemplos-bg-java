import java.util.Scanner;


public class SomaDeDoisNumeros {

	public static void main(String[] args) {
		
		//Declaração  e Atribuição de Varivel do tipo int.
		int numero1 = 0, numero2 = 0, soma =0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		numero1 = s.nextInt();
		System.out.println("Informe o numero: ");
		numero2 = s.nextInt();
		soma = (numero1 + numero2);
		System.out.println("O resultado da soma dos numeros informados é : " + soma);
	
		
		
	}

}

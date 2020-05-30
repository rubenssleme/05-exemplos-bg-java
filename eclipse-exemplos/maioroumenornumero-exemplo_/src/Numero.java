import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		System.out.println("Entre com uma sequencia de  5 numeros");
		Scanner  scan = new Scanner(System.in);	

		int min =1000;
		int max=-10000;

		for(int i =0; i<=4; i++) {
			num = scan.nextInt();

			if (num >= max){
				max = num;
			}
			if (min >= num){
				min = num;
			}

		}
		System.out.println("O maior numero é : " + max + " O menor numero é :" + min);

	}

}



import java.io.Console;
import java.util.Scanner;


public class AtividadeSemanaOito {
	private String palavra01;
	private String palavra02;


	public String getPalavra01() {
		return palavra01;
	}
	public String getPalavra02() {
		return palavra02;
	}



	/*  O Metodo caracterPorCaracter
	 *  Receber uma String e retornar a mesma 
	 *  caractere a caractere para o usuário
	 */

	public void caracterPorCaracter(){

		System.out.println("Entre com a String exibir caracterPorCaracter");
		Scanner  scan = new Scanner(System.in);

		this.palavra01 = scan.nextLine();
		for(int i=0;i<=palavra01.length()-1;i++){
			System.out.println(getPalavra01().charAt(i));
		}
		System.exit(0);
	}

	/*  O Metodo deTrasParaFrente
	 *  Receber uma String e retornar a mesma 
	 *  caractere a caractere para o usuário
	 */

	public void deTrasParaFrente(){

		System.out.println("Entre com a String exibir deTrasParaFrente");
		Scanner  scan = new Scanner(System.in);	


		this.palavra01 = scan.nextLine();
		for(int i=palavra01.length()-1;i>=0;i--){
			System.out.println(getPalavra01().charAt(i));

		}
		System.exit(0);
	}	

	/*  O Metodo deSubstring Inicio e Fim
	 *  Receber uma String e retornar a mesma 
	 *  caractere a caractere para o usuário
	 */

	public void deSubstring(){

		System.out.println("Entre com a String exibir uma substring");
		Scanner  scan = new Scanner(System.in);	
		this.palavra01 = scan.nextLine();

		System.out.println("Entre com de inicio");
		Scanner  scanb = new Scanner(System.in);
		int b  = scanb.nextInt();

		System.out.println("Entre com o fim ");
		Scanner  scane = new Scanner(System.in);	
		int e = scane.nextInt();


		for(int i=palavra01.length();i>=0;i--){
			//System.out.println(getPalavra01().charAt(i));
			System.out.println(getPalavra01().substring(b,e ));
		}
		System.exit(0);
	}

	/*  O Metodo Duas String
	 *  Receber uma String e retornar a mesma 
	 *  caractere a caractere para o usuário
	 */

	public void duasString(){

		System.out.println("Entre com a 1º String ");
		Scanner  scan = new Scanner(System.in);	
		this.palavra01 = scan.nextLine();

		System.out.println("Entre com a 2º String ");
		Scanner  scanb = new Scanner(System.in);	
		this.palavra02 = scanb.nextLine();

		System.out.println(getPalavra01()+ getPalavra02());

		System.exit(0);
	}	

	/*  O Metodo caracterPorCaracter
	 *  Receber uma String e retornar a mesma 
	 *  caractere a caractere para o usuário
	 */

	public void aPorJava(){

		System.out.println("Entre com a String ");
		Scanner  scan = new Scanner(System.in);

		this.palavra01 = scan.nextLine();
		for(int i=0;i<=palavra01.length()-1;i++){
			String x = (String.valueOf(getPalavra01().charAt(i)));

			if (x.equals("a")){
				System.out.println("Java");
			}else{
				System.out.println(getPalavra01().charAt(i));
			}
		}
		System.exit(0);
	}


}





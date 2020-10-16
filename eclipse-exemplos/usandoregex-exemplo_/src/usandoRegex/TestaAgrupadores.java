package usandoRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestaAgrupadores {

	public static void main(String[] args) {
		

		/*Verifica caracteres de A até Z e a até z
				palavra = "Sql".matches("[A-Z]*");
				System.out.println(palavra);



				  
		 */      


		//	if()

		System.out.println(splitCamelCase("numeroCPFContribuinte")); 
		System.out.println(testCPF("CPF"));
	//	criaTokenizerUsandoEspaco("ola Mundo");
		numeroNoInicio("10Java");
		hashNaPalavra("Java#");
		converterCamelCase("ola Mundo");
		
		


	}

	static String splitCamelCase(String s) {
		return s.replaceAll(
				String.format("%s|%s|%s","(?<=[A-Z])(?=[A-Z][a-z])","(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	static  boolean testCPF(String cpf){
		boolean palavra = cpf.matches("[A-Z]*");
		return palavra;
	}
	/*static String criaTokenizerUsandoEspaco(String p){
		String teste = "TESTE COM SPLIT";
		String[] teste2 = teste.split(" ");
		for(String t : teste2) {
			System.out.println(t);
		}
		
		
		
		return t;
	}*/
	static boolean numeroNoInicio(String s){
		//Verifica se foi escrita em letra maiúscula ou minúscula
				 boolean palavra = "10Java".matches("\\d{1,9}[a-zA-Z]{3,9}");
				System.out.println("letra maiúscula ou minúscula - " + palavra);
		
		return palavra;
	}

	static boolean hashNaPalavra(String s){
		//Verifica se foi escrita em letra maiúscula ou minúscula
				 boolean palavra = "jva#".matches("\\w+#");
				System.out.println("letra Hashh- " + palavra);
		return palavra;
	}
	
	public static List<String>converterCamelCase(String original){
		List<String> palavras = new ArrayList<String>();
		String[] teste2 = original.split(" ");
		
		for(String t : teste2) {
			palavras.add(t);
		}
		
		for(String s : palavras ){
			System.out.println("usando Lista - " + s.toString());
		}
		
		return palavras;
	}
}

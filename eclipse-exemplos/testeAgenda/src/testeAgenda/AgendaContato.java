package testeAgenda;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContato {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
        int i;
		
        System.out.printf("Percorrendo array usando for: \n\n");	
		ArrayList<String> agenda =  new ArrayList();
		agenda.add("RubensLeme -  11 1111-1111\n");
		agenda.add("RubensLeme -  22 2222-2222\n");
		agenda.add("RubensLeme -  33 3333-3333\n");
		agenda.add("RubensLeme -  44 4444-4444\n");
		int n = agenda.size();		
		for(i=0; i<n;i++) {
			System.out.printf("O valor é %d e %s",i,agenda.get(i));
		}
	
		i=0;	
		System.out.printf("Percorrendo array usando for-each: \n\n");
	    for(String contato : agenda) {
		   System.out.printf("Posição %d - %s",i ,contato);
		   i++;
		}
	   
	  
	   System.out.println("Digite uma valor");
	   i = ler.nextInt();
	   try {
			agenda.remove(i);
		}catch(IndexOutOfBoundsException e){
			System.out.printf("\n Erro: Posição invalida (%s).",i);
			e.getMessage();
		}
	}
	
	
}

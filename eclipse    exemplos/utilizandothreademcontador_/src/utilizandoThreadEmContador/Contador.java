package utilizandoThreadEmContador;

import java.util.Random;

public class Contador {
	
	private int id;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void testeFor() {
		for (int i = 0; i < 103; i++) {
	         System.out.println("Programa " + id + " valor: " + i);
		}
		System.out.println("#######################--FIM For--#########################");
	}
	
	public void testeWhile() {
		int i = 0;
		while(i < 103) {
	         System.out.println("Programa " + id + " valor: " + i);
	         i++;
		}
		System.out.println("#######################--FIM While--#########################");
	}
	
	public int randomBG(){
		  Random gerador = new Random();
		  
	       int resultado = gerador.nextInt(103);
	 
	        System.out.println(resultado);
	        
	        return resultado;
	}
	
}

import java.util.ArrayList;


public class Principal {
	public static void main(String args[]){

		ArrayList<String> lista = new ArrayList<String>();

		String itemUm = "Diego Neri";
		lista.add(itemUm);

		String itemDois = "Gustavo Piva";
		lista.add(0, itemDois);
		
		lista.set(0, itemDois);
		lista.remove(0);
		
		
		System.out.println(lista);
	}
}

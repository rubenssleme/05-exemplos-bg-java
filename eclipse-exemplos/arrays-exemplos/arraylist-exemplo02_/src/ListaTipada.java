import java.util.ArrayList;
public class ListaTipada {

	@SuppressWarnings("unchecked")
	public static void main(String args[]){

		String itemUm = "Diego Neri";		
		String itemDois = "Gustavo Piva";
		
		ArrayList lista = new ArrayList();
		lista.add(itemUm);
		lista.add(0, itemDois);

		for (Object object : lista) {

		}

		ArrayList<String> listaTipada = new ArrayList<String>();		
		listaTipada.add(itemUm);
		listaTipada.add(0, itemDois);
		for (String string : listaTipada) {
			System.out.println(listaTipada);
			


		}
	}
}




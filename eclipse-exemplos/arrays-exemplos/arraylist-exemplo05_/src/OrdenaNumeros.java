import java.util.ArrayList;

import javax.swing.JOptionPane;
public class OrdenaNumeros {

	public static void main(String args[]){
	
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		Integer maior = Integer.MIN_VALUE;	
		
		listaNumeros.add(new Integer(290));
		listaNumeros.add(new Integer(55));
		listaNumeros.add(new Integer(300));
		
		
		for (Integer numero : listaNumeros) {
			if (numero.intValue() > maior.intValue()){
				
			}
			if (numero.compareTo(maior) > 0){
				maior = numero;
			}
		}

		JOptionPane.showMessageDialog(null, maior);	
	}
}




package comparatorCapitulo4lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCapitulo4Lambda {
	

	public static void main(String[] args) {
		Usuario user1  = new Usuario("Paulo Silva", 150);
		Usuario user2  = new Usuario("Rodrigo Silva2", 155);
		Usuario user3  = new Usuario("Allan Silva3", 159);
		
		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			public int compare(Usuario u1, Usuario u2) {
				return u1.getNome().compareTo(u2.getNome());
			}
		};
		Collections.sort(usuarios, comparator);
	}

}

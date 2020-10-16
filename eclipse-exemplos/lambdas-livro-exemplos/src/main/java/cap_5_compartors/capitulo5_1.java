package cap_5_compartors;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import exemplolambdaslivro.Usuario;

//5.1 Comparators como lambda
public class capitulo5_1 {

	Usuario user1 = new Usuario("Paulo Silva", 150);
	Usuario user2 = new Usuario("Rubens Silva", 150);
	Usuario user3 = new Usuario("Guilherme Silva", 150);
	List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

//exemplo01
	void teste1() {
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			public int compare(Usuario u1, Usuario u2) {
				return u1.getNome().compareTo(u2.getNome());
			}
		};
	}

//exemplo02
	void teste2() {
		Comparator<Usuario> comparator = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
		Collections.sort(usuarios, comparator);
	}

// exemplo03
	void teste3() {
		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
	}


	//5.2 O método List.sort
// exemplo04
		void teste4() {
			usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		}	
	
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import exemplolambdaslivro.Usuario;



public class Capitulo7 {

	public static void main(String[] args) {
			Usuario user1 = new Usuario("Paulo Silveira", 150);
			Usuario user2 = new Usuario("Rodrigo Turini", 120);
			Usuario user3 = new Usuario("Guilherme Silveira", 90);
			List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
			usuarios.stream()
				.sorted(Comparator.comparing(Usuario::getNome))
				.peek(System.out::println)
				.findAny();
			
			
			
	}

}

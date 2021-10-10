package exemplolambdaslivro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//Outro exemplo: Consumer
class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}
}


class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silva", 150);
		Usuario user2 = new Usuario("Rubens Silva", 150);
		Usuario user3 = new Usuario("Guilherme Silva", 150);
// Exemplo 1
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
// Exemplo 2
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);

		Consumer<Usuario> mostrador1 = new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		};
		usuarios.forEach(mostrador);
// Exemplo 3
		usuarios.forEach(new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());

			}

		});
// Exemplo 4 com Lambda
		Consumer<Usuario> mostrador2 = (Usuario u) -> {
			System.out.println(u.getNome());
		};

// Exemplo 5  com Lambda
		Consumer<Usuario> mostrador3 = u -> {
			System.out.println(u.getNome());
		};

// Exemplo 6  com Lambda
		Consumer<Usuario> mostrador4 = u -> System.out.println(u.getNome());

// Exemplo 6  com Lambda
		usuarios.forEach( u -> System.out.println(u.getNome()));
		usuarios.forEach(u -> u.tornarModerador());

		
	}

}

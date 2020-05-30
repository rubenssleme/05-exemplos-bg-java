package predicateCapitulo4Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateCapitulo4 {


	public static void main(String[] args) {
		Usuario user1  = new Usuario("Paulo Silva", 150);
		Usuario user2  = new Usuario("Rodrigo Silva2", 165);
		Usuario user3  = new Usuario("Allan Silva3", 169);
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		Predicate<Usuario> predicate = new Predicate<Usuario>() {
			public boolean test(Usuario u) {
				return u.getPonto() > 160;
			}
		};

		usuarios.removeIf(predicate);
		usuarios.forEach(u-> System.out.println(u.getNome()+"-"+ u.getPonto()));


	}

}

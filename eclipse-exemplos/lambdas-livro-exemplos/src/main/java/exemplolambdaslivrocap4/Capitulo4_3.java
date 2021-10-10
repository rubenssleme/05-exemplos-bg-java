package exemplolambdaslivrocap4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exemplolambdaslivro.*;
public class Capitulo4_3 {
	Usuario user1,user2,user3;
//	remover todos os usuários com mais de 100 pontos da nossa coleção
//Exemplo01	
	void teste1() {
		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			public boolean test(Usuario u) {
			return u.getPontos() > 160;
			}
			};
			List<Usuario> usuarios = new ArrayList<>();
			usuarios.add(user1);
			usuarios.add(user2);
			usuarios.add(user3);
			usuarios.removeIf(predicado);
			usuarios.forEach(u -> System.out.println(u));
	}

}

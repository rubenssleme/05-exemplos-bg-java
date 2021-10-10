package consumerCapitulo4Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerCapitulo4 {

	public static void main(String[] args) {
		Usuario user1  = new Usuario("Paulo Silva", 150);
		Usuario user2  = new Usuario("Rodrigo Silva2", 155);
		Usuario user3  = new Usuario("Allan Silva3", 159);
		
		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		System.out.println();
		Consumer<Usuario>mostraMensagem = u -> 
		System.out.println("Antes de imprimir");
		
		Consumer<Usuario> imprimeNome = u ->
		System.out.println(u.getNome());
		
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		

	}

}

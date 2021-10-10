package Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modell.Usuario;

/* 
 * Todos os atributos e metodos dessa classe são estaticos para poderem ser utilizados 
 * em qualquer parte do projeto sem a necessidade de instanciar um objeto do tipo GerenciadorUsuario
 */

public class GerenciadorUsuario {
		
	// Declaração de um array do tipo ArrayList como atributo da classe
	private static ArrayList<Usuario> vetorUsuarios = new ArrayList<Usuario>();
	
	
	// get e set do atributo vetorUsuarios
	public static ArrayList<Usuario> getVetorUsuarios() {
		return vetorUsuarios;
	}

	public static void setVetorUsuarios(ArrayList<Usuario> vetorUsuarios) {
		GerenciadorUsuario.vetorUsuarios = vetorUsuarios;
	}

	
	// Metodos de manipulação do array
	
	public static void incluirUsuario(Usuario usu){
		vetorUsuarios.add(usu);
	}
	
	public static void alterarUsuario(Usuario usu, int indice){
		vetorUsuarios.set(indice, usu);
	}
	
	public static void excluirUsuario(int indice){
		vetorUsuarios.remove(indice);
	}
	
	
	public static void consultarUsuario(){

		// Declara uma String para listar os usuarios 
		String relacao = "Relação de Clientes Cadastrados\n";
		
		// Declara e inicializa um contador
		int cont = 0;

		// Percorre o array e monta a String com seus dados
		while (cont < vetorUsuarios.size()) {
			relacao = relacao + "\n" + cont + " - " + vetorUsuarios.get(cont).getNome() + " - " + vetorUsuarios.get(cont).getLogin() + " - " + vetorUsuarios.get(cont).getSenha();
			cont++;
		}
		
		// Apresenta os usuarios armazenados no array
		JOptionPane.showMessageDialog(null, relacao + "\n");

	}

	
}

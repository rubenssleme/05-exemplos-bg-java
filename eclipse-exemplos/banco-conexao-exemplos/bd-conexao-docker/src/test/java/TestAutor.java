import br.com.example.conexadocker.controller.RepositorioAutor;
import br.com.example.conexadocker.model.Autor;
import org.junit.Test;

public class TestAutor {

	@Test
	public void test_cadastro_autor(){
		Autor autor = new Autor();
		autor.setNome("Jorge Amado");
		new RepositorioAutor().salvar(autor);
	}
	@Test
	public void test_cadastro_autor1(){
		Autor autor = new Autor();
		autor.setNome("Rui Barbosa");
		if (new RepositorioAutor().inclui(autor)){
			System.out.println("Cadastro do autor executado com sucesso!!");
		}else{
			System.out.println("Erro ao executar o cadastro do autor!!");
		}
	}
	@Test
	public void test_cadastro_autor_null(){
		Autor autor = new Autor();
		autor = null;
		new RepositorioAutor().salvar(autor);
	}

}

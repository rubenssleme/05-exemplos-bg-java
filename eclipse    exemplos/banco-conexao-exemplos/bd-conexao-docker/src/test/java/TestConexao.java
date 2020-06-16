import br.com.example.conexadocker.controller.RepositorioCliente;
import br.com.example.conexadocker.controller.RepositorioUsuario;
import br.com.example.conexadocker.model.Cliente;
import br.com.example.conexadocker.model.Usuario;
import org.junit.Test;
import br.com.example.conexadocker.persistencia.Conexao;

public class TestConexao {

	@Test
	public void test_conectarBancoSucesso() {
		new Conexao().testarConexao();
	}

	@Test
	public void test_inclusao_usuario() {
		Usuario usuario = new Usuario();
		usuario.setNome("Praxede2");
		usuario.setEmail("Praxede2@");
		usuario.setTipo("ADM");
		usuario.setLogin("rleme");
		usuario.setSenha("123");
		new RepositorioUsuario().salvar(usuario);
	}



}





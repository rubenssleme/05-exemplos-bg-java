import br.com.example.conexadocker.controller.RepositorioCliente;
import br.com.example.conexadocker.model.Cliente;
import org.junit.Test;

public class TestCliente {

    @Test
    public void test_inclusao_cliente() {
        Cliente cliente = new Cliente();
        cliente.setLogin("rleme");
        cliente.setSenha("1234567");
        cliente.setNome("Praxede2");
        cliente.setCpf("146.854.1111");
        cliente.setTelefone("77777777");
        cliente.seteMail("rubens@");
        cliente.setEndereco("av nelson t");
        cliente.setBairro("Jaragua");
        cliente.setCidade("são paulo");
        cliente.setUf("SP");
        cliente.setCep("02998000");
        new RepositorioCliente().salvar(cliente);
    }

    @Test
    public void test_inclusao_cliente1() {
        Cliente cliente = new Cliente();
        cliente.setLogin("rleme");
        cliente.setSenha("1234567");
        cliente.setNome("Praxede2");
        cliente.setCpf("146.854.1111");
        cliente.setTelefone("77777777");
        cliente.seteMail("rubens@");
        cliente.setEndereco("av nelson t");
        cliente.setBairro("Jaragua");
        cliente.setCidade("são paulo");
        cliente.setUf("SP");
        cliente.setCep("02998000");
        new RepositorioCliente().inclui(cliente);
    }
}

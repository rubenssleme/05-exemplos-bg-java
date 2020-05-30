
import br.com.bg.bghibernate.dominio.Cliente;
import br.com.bg.bghibernate.repositorios.RepositorioCliente;
import java.util.Date;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Rubens Leme
 */
public class RepositorioClienteTeste {

    @Test
    public void salvar() {
        Cliente cliente = new Cliente();
        cliente.setNome("Rubens Leme");
        cliente.setCPF("14685444892");
        cliente.setRG("25420020201");
       // cliente.setDataNascimento(nascto);
        cliente.setSexo("M");
        cliente.seteMail("Rubens@");
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        repositorioCliente.salvar(cliente);
    }

    @Test
    @Ignore
    public void listar() {
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        List<Cliente> resultado = repositorioCliente.listar();

        for (Cliente cliente : resultado) {
            System.out.println("Codigo: " + cliente.getId() + "- Nome: " + cliente.getNome() + "- Cpf: " + cliente.getCPF()
                    + "Sexo: " + cliente.getSexo() + "E-mail: " + cliente.geteMail());

        }
        System.out.println();

    }

    @Test
    @Ignore
     public void buscar() {
        Long codigo = 1L;
        Cliente cliente = new RepositorioCliente().buscar(codigo);
        if (cliente == null) {
            System.out.println("Registro não encontrado: ");
        } else {
            System.out.println("Registro encontrado: ");
            System.out.print(cliente.toString());
        }
    }

     
     
     
     
     
     
     
     
    @Test
    @Ignore
     public void excluir() {
        Long codigo = 4L;
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        Cliente cliente = new RepositorioCliente().buscar(codigo);

        if (cliente == null) {
            System.out.println("Registro não encontrado: ");
        } else {
            System.out.println("Registro removido com  sucesso!!! : ");
            System.out.print(cliente.toString());
        }
        repositorioCliente.excluir(cliente);
    }

    @Test
    @Ignore
     public void alterar() {
        Long codigo = 1L;
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        Cliente cliente = new RepositorioCliente().buscar(codigo);

        if (cliente == null) {
            System.out.println("Registro não encontrado: ");
        } else {
            System.out.println("Registro Alterado com  sucesso!!! : ");
            System.out.print(cliente.toString());
            //editar(cliente);
            repositorioCliente.editar(cliente);
        }

    }
   
}

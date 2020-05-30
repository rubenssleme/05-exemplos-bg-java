package br.com.carloskafka.sisprojeto;

import br.com.carloskafka.sisprojeto.dominio.Cliente;
import br.com.carloskafka.sisprojeto.dominio.ContaAcesso;
import br.com.carloskafka.sisprojeto.repositorios.RepositorioCliente;
import br.com.carloskafka.sisprojeto.repositorios.RepositorioContaAcesso;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void autenticar_login_de_usuario_com_sucesso() {
        ContaAcesso ca = ContextoContaAcesso.fabricarContaAcessoAdministradorComTodosOsDados();
        RepositorioContaAcesso repositoriocontaacesso = new RepositorioContaAcesso();
        ContaAcesso contaacessoobtida = repositoriocontaacesso.autenticar(ca);
        Assert.assertNotNull(contaacessoobtida);
    }

    @Test
    public void autenticar_login_de_usuario_sem_sucesso() {
       // ContaAcesso contaAcesso = new ContaAcesso();
       ContaAcesso ca = ContextoContaAcesso.fabricarContaAcessoAdministradorComTodosOsDados(); 
       RepositorioContaAcesso repositoriocontaacesso = new RepositorioContaAcesso();
        ContaAcesso contaacessoobtida = repositoriocontaacesso.autenticar(ca);
        String login = contaacessoobtida.getLogin();
        Assert.assertNotEquals(login,"rubens");
    }

    @Test
    public void cadastrar_cliente_todos_os_campos_com_sucesso() {
        Cliente cliente = ContextoCliente.inicializarObjeto();
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        boolean clienteIncluido = repositorioCliente.incluir(cliente);
        Assert.assertTrue(clienteIncluido);

    }

    @Test
    public void cadastrar_cliente_todos_os_campos_sem_sucesso() {
       Cliente cliente = new Cliente();
       //Cliente cliente =  ContextoCliente.inicializarObjeto();
       // cliente.setId(null);
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        boolean clienteIncluido = repositorioCliente.incluir(cliente);

       //Assert.assertEquals(cliente.getId(), "");
        Assert.assertFalse(cliente.validar());
        /*Assert.assertEquals(cliente.getCnpj(), "");
        Assert.assertEquals(cliente.getRazaoSocial(), "");
        Assert.assertEquals(cliente.getEmail(), "");
        Assert.assertEquals(cliente.getTelefone(), "");*/

    }

}

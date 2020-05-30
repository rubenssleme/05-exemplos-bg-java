package br.com.carloskafka.sishibernateserver.repositorios;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;
import br.com.carloskafka.sishibernateserver.fabricas.ContextoCliente;
import br.com.carloskafka.sishibernateserver.infra.Registro;
import br.com.carloskafka.sishibernateserver.repositorio.RepositorioCliente;

public class TestesRepositorioCliente {
	private RepositorioCliente repositorioCliente;

	public TestesRepositorioCliente() {
		repositorioCliente = Registro.obterRepositorioCliente();
	}

	@Test
	public void repositorio_de_cliente_salva_e_obtem_cliente_cadastrado_com_sucesso() {
		Cliente cliente = repositorioCliente.salvar(ContextoCliente
				.construirClienteComTodosOsDados());

		Cliente clienteObtido = repositorioCliente.obterPorId(cliente.getId());

		Assert.assertEquals(clienteObtido.getId(), cliente.getId());
		Assert.assertEquals(clienteObtido.getNome(), cliente.getNome());
		Assert.assertEquals(clienteObtido.getCnpj(), cliente.getCnpj());
		Assert.assertEquals(clienteObtido.getRazaoSocial(),
				cliente.getRazaoSocial());
		Assert.assertEquals(clienteObtido.getEmail(), cliente.getEmail());
		Assert.assertEquals(clienteObtido.getTelefone(), cliente.getTelefone());
	}
	

	@Test
	public void repositorio_de_cliente_altera_cliente_existente_com_sucesso() {
		String novoNome = "NOVO NOME";
		
		Cliente clienteASalvar = ContextoCliente.construirClienteComTodosOsDados();
		
		Cliente clienteSalvo = repositorioCliente.salvar(clienteASalvar);
		
		clienteSalvo.setNome(novoNome);
		
		Cliente clienteAlteradoObtido = repositorioCliente.salvar(clienteSalvo);
		
		Assert.assertEquals(clienteASalvar.getNome(), clienteAlteradoObtido.getNome());
	}

}

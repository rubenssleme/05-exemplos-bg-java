package br.com.carloskafka.sishibernateserver.servicos.rmi;

import java.rmi.RemoteException;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoEdicaoClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoListagemClienteDTO;
import br.com.carloskafka.sishibernatecommons.servicos.ServicoSisHibernateServer;
import br.com.carloskafka.sishibernateserver.fabricas.ContextoCliente;
import br.com.carloskafka.sishibernateserver.infra.Registro;

public class TestesServicoSisHibernateServerRmi {
	private ServicoSisHibernateServer servicoSisHibernateServer;

	public TestesServicoSisHibernateServerRmi() {
		servicoSisHibernateServer = Registro.obterServicoSisHibernateServer();
	}

	@Test
	public void servico_obtem_listagem_clientes() throws RemoteException {
		ResultadoListagemClienteDTO resultadoListagemCliente = servicoSisHibernateServer
				.obterListagemClientes();

		Assert.assertTrue(resultadoListagemCliente.sucesso());
		Assert.assertFalse(resultadoListagemCliente.getObjetosDto()
				.isEmpty(), "A lista deveria conter os itens.");
		Assert.assertEquals(resultadoListagemCliente.getObjetosDto().size(),
				44);
	}

	@Test
	public void servico_inclui_novo_cliente() throws RemoteException {
		ClienteDTO clienteASalvar = ContextoCliente
				.construirClienteDtoComTodosOsDados();

		ResultadoEdicaoClienteDTO resultadoInclusaoCliente = servicoSisHibernateServer
				.editarCliente(clienteASalvar);

		Assert.assertTrue(resultadoInclusaoCliente.sucesso());		
	}
}

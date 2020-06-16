package br.com.carloskafka.sishibernateserver.servicos.rmi;

import java.rmi.RemoteException;

import javax.inject.Inject;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoEdicaoClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoListagemClienteDTO;
import br.com.carloskafka.sishibernatecommons.servicos.ServicoSisHibernateServer;
import br.com.carloskafka.sishibernateserver.fachadas.FachadaCliente;

public class ServicoSisHibernateServerRmi implements ServicoSisHibernateServer {

	@Inject
	private FachadaCliente fachadaCliente;

	public ServicoSisHibernateServerRmi() {
	}

	public ResultadoListagemClienteDTO obterListagemClientes() throws RemoteException {
		return fachadaCliente.obterListagemClientes();
	}

	@Override
	public ResultadoEdicaoClienteDTO editarCliente(ClienteDTO clienteDto)
			throws RemoteException {
		return fachadaCliente.editarCliente(clienteDto);
	}

}
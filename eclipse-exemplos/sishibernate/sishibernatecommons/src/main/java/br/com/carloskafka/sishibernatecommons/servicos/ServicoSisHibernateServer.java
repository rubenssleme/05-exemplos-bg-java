package br.com.carloskafka.sishibernatecommons.servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoEdicaoClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoListagemClienteDTO;

public interface ServicoSisHibernateServer extends Remote {

	public ResultadoEdicaoClienteDTO editarCliente(ClienteDTO clienteDto)
			throws RemoteException;
	public ResultadoListagemClienteDTO obterListagemClientes() throws RemoteException;;
}
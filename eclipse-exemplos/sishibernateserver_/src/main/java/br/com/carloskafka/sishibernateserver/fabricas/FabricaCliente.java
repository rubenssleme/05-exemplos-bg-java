package br.com.carloskafka.sishibernateserver.fabricas;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;

public class FabricaCliente extends FabricaRecursiva<ClienteDTO, Cliente> {

	@Override
	public Cliente converterParaDominio(ClienteDTO clienteDto, Cliente cliente) {
		if (clienteDto.getId() != null) {
			cliente.setId(clienteDto.getId());
		}
		cliente.setNome(clienteDto.getNome());
		cliente.setCnpj(clienteDto.getCnpj());
		cliente.setRazaoSocial(clienteDto.getRazaoSocial());
		cliente.setEmail(clienteDto.getEmail());
		cliente.setTelefone(clienteDto.getTelefone());
		cliente.setVersao(clienteDto.getVersao());
		return cliente;
	}

	@Override
	public Cliente obterNovo() {
		return new Cliente();
	}

	@Override
	public ClienteDTO converterParaDTO(Cliente cliente) {
		ClienteDTO clienteDto = new ClienteDTO();
		
		if (cliente.getId() != null) {
			clienteDto.setId(cliente.getId());
		}
		clienteDto.setNome(cliente.getNome());
		clienteDto.setCnpj(cliente.getCnpj());
		clienteDto.setRazaoSocial(cliente.getRazaoSocial());
		clienteDto.setEmail(cliente.getEmail());
		clienteDto.setTelefone(cliente.getTelefone());
		clienteDto.setVersao(cliente.getVersao());
		return clienteDto;
	}

}

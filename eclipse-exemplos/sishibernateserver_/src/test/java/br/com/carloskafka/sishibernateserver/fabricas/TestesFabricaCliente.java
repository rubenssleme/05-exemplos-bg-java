package br.com.carloskafka.sishibernateserver.fabricas;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;

public class TestesFabricaCliente {

	@Test
	public void fabrica_cliente_converte_objeto_de_dominio_para_dto() {
		Cliente cliente = ContextoCliente.construirClienteComTodosOsDados();

		ClienteDTO clienteDto = new FabricaCliente().converterParaDTO(cliente);

		Assert.assertEquals(clienteDto.getId(), cliente.getId());
		Assert.assertEquals(clienteDto.getNome(), cliente.getNome());
		Assert.assertEquals(clienteDto.getCnpj(), cliente.getCnpj());
		Assert.assertEquals(clienteDto.getRazaoSocial(),
				cliente.getRazaoSocial());
		Assert.assertEquals(clienteDto.getEmail(), cliente.getEmail());
		Assert.assertEquals(clienteDto.getTelefone(), cliente.getTelefone());
	}

	@Test
	public void fabrica_cliente_converte_objeto_de_dto_para_dominio() {
		ClienteDTO clienteDto = ContextoCliente.construirClienteDtoComTodosOsDados();

		Cliente cliente = new FabricaCliente().converterParaDominio(clienteDto);

		Assert.assertEquals(cliente.getId(), clienteDto.getId());
		Assert.assertEquals(cliente.getNome(), clienteDto.getNome());
		Assert.assertEquals(cliente.getCnpj(), clienteDto.getCnpj());
		Assert.assertEquals(cliente.getRazaoSocial(),
				clienteDto.getRazaoSocial());
		Assert.assertEquals(cliente.getEmail(), clienteDto.getEmail());
		Assert.assertEquals(cliente.getTelefone(), clienteDto.getTelefone());
	}
}

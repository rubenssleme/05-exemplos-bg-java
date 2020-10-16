package br.com.carloskafka.sishibernateserver.fabricas;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;
import br.com.carloskafka.sishibernateserver.fabricas.FabricaCliente;

public class ContextoCliente {
	public static Cliente construirClienteComTodosOsDados() {
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Joãozinho");
		cliente.setCnpj("1111111111111");
		cliente.setRazaoSocial("TESTE");
		cliente.setEmail("teste@teste.org.br");
		cliente.setTelefone("1111111111111");
		cliente.setVersao("");
		return cliente;
	}

	public static ClienteDTO construirClienteDtoComTodosOsDados() {
		Cliente cliente = ContextoCliente.construirClienteComTodosOsDados();
		return new FabricaCliente().converterParaDTO(cliente);
	}
}

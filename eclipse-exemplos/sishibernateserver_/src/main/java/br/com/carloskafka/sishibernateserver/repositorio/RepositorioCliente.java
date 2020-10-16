package br.com.carloskafka.sishibernateserver.repositorio;

import java.util.List;

import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;

public interface RepositorioCliente {
	public Cliente salvar(Cliente cliente);
	public List<Cliente> obterTodos();
	public Cliente obterPorId(Long id);
}

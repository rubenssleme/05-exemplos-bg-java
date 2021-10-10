package br.com.carloskafka.sishibernateserver.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;

@Repository
public class RepositorioClienteBD extends RepositorioDB<Cliente> implements
		RepositorioCliente {

	@Transactional
	public Cliente salvar(Cliente cliente) {
		String acao = "";
		try {
			if (!cliente.possuiId()) {
				em.persist(cliente);
				acao = "Inclusao";
			} else {
				em.merge(cliente);
				acao = "Alteracao";
			}
		} catch (Exception e) {
			logger.error("Ocorreu algum erro durante o armazenamento do "
					+ cliente + ". \nDetalhes: " + e);		}
		logger.info(acao + " do " + cliente + " realizada com sucesso.");
		return cliente;
	}

	public List<Cliente> obterTodos() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			TypedQuery<Cliente> query = em.createQuery(
					"SELECT c FROM Cliente c", Cliente.class);
			clientes = query.getResultList();
		} catch (Exception e) {
			logger.fatal(e.getMessage());
		}
		return clientes;
	}
}

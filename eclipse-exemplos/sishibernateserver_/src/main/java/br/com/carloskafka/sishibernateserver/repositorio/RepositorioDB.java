package br.com.carloskafka.sishibernateserver.repositorio;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

public abstract class RepositorioDB<DOMINIO> {
	protected Logger logger;

	@PersistenceContext
	protected EntityManager em;

	public RepositorioDB() {
		this.logger = Logger.getLogger(getClass());
	}

	public DOMINIO obterPorId(Long id) {
		DOMINIO objeto = null;
		if (id != null) {
			try {
				objeto = (DOMINIO) em.find(obterEntidade(), id);
			} catch (Exception e) {
				logger.error("Não foi possível obter o " + obterNomeEntidade()
						+ " com o id " + id + ".\n Detalhe:" + e);
			}
		}
		return objeto;
	}

	@SuppressWarnings("unchecked")
	private Class<DOMINIO> obterEntidade() {
		return ((Class<DOMINIO>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	private String obterNomeEntidade() {
		return obterEntidade().getSimpleName();
	}

}

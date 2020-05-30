package br.laramara.ti.sisweb.repositorios;

import java.lang.reflect.ParameterizedType;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public abstract class RepositorioDB<DOMINIO> {

	protected Logger logger;

	@PersistenceContext(unitName = "SisRHPersistenceUnit")
	protected EntityManager em;

	public RepositorioDB() {
		this.logger = Logger.getLogger(this.getClass().getPackage().getName());
	}

	@SuppressWarnings("unchecked")
	private Class<DOMINIO> obterEntidade() {
		return ((Class<DOMINIO>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	private String obterNomeEntidade() {
		return obterEntidade().getSimpleName();
	}

	public DOMINIO obterPorId(Long id) {
		DOMINIO objeto = null;
		if (id != null) {
			try {
				objeto = (DOMINIO) em.find(obterEntidade(), id);
			} catch (Exception e) {
				logger.severe("Não foi possível obter o " + obterNomeEntidade()
						+ " com o id " + id + ".\n Detalhe:" + e);
			}
		}
		return objeto;
	}

	@SuppressWarnings("unchecked")
	protected TypedQuery<DOMINIO> obterQuery(
			ComandoSQLEParametros comandoSQLEParametros) {
		TypedQuery<DOMINIO> query = (TypedQuery<DOMINIO>) em
				.createQuery(comandoSQLEParametros.getComando());

		for (Entry<String, Object> entry : comandoSQLEParametros
				.getParametros().entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query;
	}
}

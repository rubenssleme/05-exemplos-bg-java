package br.com.caelum.financas.modelo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {


	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");

	public EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("financas");
	}

}

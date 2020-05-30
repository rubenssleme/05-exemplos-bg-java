package br.com.bg.teste;

import javax.persistence.EntityManager;

import br.com.bg.Util.JPAUtil;
import br.com.bg.modelo.Conta;

public abstract class TesteRemoveConta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		
		Conta conta = em.find(Conta.class, 1);
		
		
		em.remove(conta);
		em.getTransaction().commit();
		em.close();

		
		
		
		

	}

}

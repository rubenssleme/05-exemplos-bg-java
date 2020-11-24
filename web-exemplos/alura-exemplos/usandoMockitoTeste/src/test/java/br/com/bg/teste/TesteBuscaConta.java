package br.com.bg.teste;

import javax.persistence.EntityManager;

import br.com.bg.Util.JPAUtil;
import br.com.bg.modelo.Conta;

public class TesteBuscaConta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Conta conta = em.find(Conta.class, 1);
		conta.setTitular("Ricardo silva");
		conta.setBanco("Itau");
		conta.setAgencia("341");
		conta.setNumero("651");
		
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
		em.close();


	}

}

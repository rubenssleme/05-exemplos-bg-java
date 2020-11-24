package br.com.bg.teste;

import javax.persistence.EntityManager;

import br.com.bg.Util.JPAUtil;
import br.com.bg.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Ricardo carvalho");
		conta.setBanco("Caixa Economica");
		conta.setAgencia("9132");
		conta.setNumero("156");
		// conta titular 2
		Conta conta2 = new Conta();
		conta.setTitular("Rubens Soares Leme");
		conta.setBanco("Santander");
		conta.setAgencia("3030");
		conta.setNumero("213");
		
		
		 EntityManager em = new JPAUtil().getEntityManager();
	        em.getTransaction().begin();
	        em.merge(conta);
	        em.getTransaction().commit();
	        em.close();
	        
	        
	        EntityManager em2 = new JPAUtil().getEntityManager();
	        em2.getTransaction().begin();
	        em2.merge(conta2);
	        em2.getTransaction().commit();
	        em2.close();
	        
		
	}
}

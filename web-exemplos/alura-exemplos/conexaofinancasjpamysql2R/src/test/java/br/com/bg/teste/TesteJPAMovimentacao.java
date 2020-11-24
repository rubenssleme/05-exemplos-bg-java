package br.com.bg.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.bg.Util.JPAUtil;
import br.com.bg.modelo.Conta;
import br.com.bg.modelo.Movimentacao;
import br.com.bg.modelo.TipoMovimentacao;

public class TesteJPAMovimentacao {

	public static void main(String[] args) {
		 
		Conta conta = new Conta();
		conta.setNumero("665");
		conta.setBanco("Itau");
		conta.setAgencia("5290");
		conta.setTitular("Carlos Silva");
		
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Churrasco com o time  Caixa");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal(200.00));
		movimentacao.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
	    em.getTransaction().begin();
	     
	    em.persist(conta);
	    em.persist(movimentacao);    
	    
	    em.getTransaction().commit();    
	    em.close();    

	}

}

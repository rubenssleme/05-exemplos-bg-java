package com.aprendaefaca.usandoHibernate.control;



import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;








import com.aprendaefaca.usandoHibernate.control.*;
import com.aprendaefaca.usandoMavenHibernate.model.Produto;



public class GerenciaProduto {

	EntityManagerFactory emf;
	EntityManager em;

	public GerenciaProduto(){
		emf = Persistence.createEntityManagerFactory("DBteste");
		em = emf.createEntityManager();
	}


	public void salvar(Produto produto){
		em.getTransaction().begin();
		em.merge(produto);
		em.getTransaction().commit();
		em.close();
	}

	public void remover(Produto produto){
		em.getTransaction().begin();
		em.remove(produto);
		em.getTransaction().commit();
		em.close();

	}

	public Produto obterPorId(int id){
		
		//Abrir Transação
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, id);
		//em.remove(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}


	public  List<Produto> listaTodos(){

		em.getTransaction();
		Query consulta = em.createQuery("select produto from Produto produto");
		List<Produto> produtos = consulta.getResultList();
		em.getTransaction();
		emf.close();
		return produtos;
	}




}

package br.com.bg.usandomokitoteste.dao;

import java.awt.geom.RectangularShape;

import javax.persistence.EntityManager;

import br.com.bg.Util.JPAUtil;
import br.com.bg.modelo.Cliente;

public class ClienteDAO {

	EntityManager entityManager = new JPAUtil().getEntityManager();



	public void list(Cliente cliente) {
		try {

		}catch(Exception ex) {

		}
	}

	public String persiste(Cliente cliente)  {
		String i = "";
		
		try {
			entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
        i = "sucesso1";
		}catch(Exception ex) {
			ex.printStackTrace();
            entityManager.getTransaction().rollback();
         i = "false";   
		}
		
		return i;
	}

	public void merge(Cliente cliente) {
		try {
			entityManager.getTransaction().begin();
            cliente = entityManager.find(Cliente.class, cliente.getId());
            entityManager.remove(cliente);
            entityManager.getTransaction().commit();

		}catch(Exception ex) {
			ex.printStackTrace();
            entityManager.getTransaction().rollback();
		}
	}
	public void drop(Cliente cliente) {
		try {

		}catch(Exception ex) {

		}
	}






}

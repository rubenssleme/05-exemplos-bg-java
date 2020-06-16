package br.com.casadocodigoR.loja.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigoR.loja.models.Book;

public class BookDAO {

@PersistenceContext	
private EntityManager manager;

@Transactional
public void save(Book product) {
	manager.persist(product);
}
}

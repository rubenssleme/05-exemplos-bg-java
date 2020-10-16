package br.com.casadocodigoR.loja.managedbeans;



import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigoR.loja.controller.BookDAO;
import br.com.casadocodigoR.loja.models.Book;

@Model
public class AdminBooksBean {
	
	Book product = new Book();
	@Inject
	private BookDAO bookDAO;
	
	@Transactional
	public void save() {
	bookDAO.save(product);
	}
	
	public Book getProduct() {
		return product;
	}
}

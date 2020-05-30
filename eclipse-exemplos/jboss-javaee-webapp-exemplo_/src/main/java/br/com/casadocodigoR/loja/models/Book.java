package br.com.casadocodigoR.loja.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
			
	private Integer id;
	private String title;
	private String description;
	private int numberOfPages;
	private BigDecimal price;
	
	public Book() {
		
	}

	public Book(Integer id, String title, String description, int numberOfPages, BigDecimal price) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.numberOfPages = numberOfPages;
		this.price = price;
	}
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", nuberOfPages=" + numberOfPages
				+ ", price=" + price + "]";
	}

	
	
}

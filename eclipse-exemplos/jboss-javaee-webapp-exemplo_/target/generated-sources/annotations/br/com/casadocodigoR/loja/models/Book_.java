package br.com.casadocodigoR.loja.models;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, Integer> numberOfPages;
	public static volatile SingularAttribute<Book, BigDecimal> price;
	public static volatile SingularAttribute<Book, String> description;
	public static volatile SingularAttribute<Book, Integer> id;
	public static volatile SingularAttribute<Book, String> title;

}


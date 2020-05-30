package com.aprendaefaca.usandoHibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aprendaefaca.usandoHibernate.control.GerenciaProduto;
import com.aprendaefaca.usandoMavenHibernate.model.Produto;

public class TestaInsereProduto {

	public static void main(String [] args){

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DBteste");
		EntityManager em = factory.createEntityManager();

		Produto p = new Produto();
		p.setNome("Paulo Bandeiras");
		p.setPreco(40.00);

		GerenciaProduto ger = new GerenciaProduto();
		
		Produto  p2 = ger.obterPorId(4);
		p2.setNome("Arthur Leme");
		ger.salvar(p2);
		
		System.out.print(p2.getId() + " -- ");
		System.out.print(p2.getNome() + " -- ");
		System.out.println(p2.getPreco());
		

		//ger.salvar(p);

	/*	List<Produto> produtos = ger.listaTodos();

		for (Produto produto : produtos) {
			System.out.print(produto.getNome() + " -- ");
			System.out.println(produto.getPreco());

		}*/

	}

}


package br.com.example.livrariaangular.bean;

import javax.faces.bean.ManagedBean;

import br.com.example.livrariaangular.dao.DAO;
import br.com.example.livrariaangular.modelo.Autor;

@ManagedBean
public class AutorBean {

	private Autor autor = new Autor();

	public Autor getAutor() {
		return autor;
	}

	public void gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		new DAO<Autor>(Autor.class).adiciona(this.autor);
	}
}

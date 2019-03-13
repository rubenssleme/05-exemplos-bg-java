package br.com.bg.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {
	
	private String titulo;
	private String ISBN;
	private double preco;
	private String dataLancamento;
	
	public void gravarLivro() {
		System.out.println("Gravando Livro!" + this.toString());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLanacamento) {
		this.dataLancamento = dataLanacamento;
	}

	@Override
	public String toString() {
		return "LivroBean [titulo=" + titulo + ", ISBN=" + ISBN + ", preco=" + preco + ", dataLancamento="
				+ dataLancamento + "]";
	}
	
	
	

}

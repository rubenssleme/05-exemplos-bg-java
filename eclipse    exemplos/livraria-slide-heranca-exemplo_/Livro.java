import javax.swing.*;

// A classe Livro eh subclasse de Produto
public class Livro extends Produto {
	
	// Atributos
	private String autor;
	private String editora;
	private String edicao;
	
	// Construtores
	public Livro() {
		this("","",0,0,"","","");
	}

	public Livro(String descricao, String genero, int estoqueDisponivel, double precoCusto, String autor, String editora, String edicao) {
		super(descricao, genero, estoqueDisponivel, precoCusto);
		
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	// Getters e Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}


	// Metodos especificos da classe
	
	public void listarProduto(){
		JOptionPane.showMessageDialog(null, "Descricao: " + this.getDescricao() + "\nGenero: " + this.getGenero() + "\nEstoque: " + this.getEstoqueDisponivel() + "\nPreco de custo: " + this.getPrecoCusto() + "\nAutor: " + this.getAutor() + "\nEditora: " + this.getEditora() + "\nEdicao: " + this.getEdicao());		
	}
	
	
}

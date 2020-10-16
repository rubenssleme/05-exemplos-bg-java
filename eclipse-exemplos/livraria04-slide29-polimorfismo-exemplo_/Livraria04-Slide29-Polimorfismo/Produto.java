import javax.swing.*;

abstract class Produto {

	// Atributos
	protected String descricao;
	protected String genero;
	protected int estoqueDisponivel;
	protected double precoCusto;
	protected double precoVenda;
	
	// Construtores
	// -- Inicializa os atributos "zerados"
	public Produto() {
		this("","",0,0,0);
	}
	
	// -- Possibilita a inicialização dos atributos com valores passados por parametro
	public Produto(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}

	// Getters e Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	// Metodos especificos da classe
	
	abstract void calcularPrecoVenda();
		
	
	abstract void listarProduto();
	
}

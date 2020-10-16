import javax.swing.JOptionPane;

//A classe Dvd eh subclasse de Produto
public class Dvd extends Produto {

	private String diretor;
	private String duracao;
	private String censura;
	
	public Dvd() {
		this("","",0,0,0,"","","");
	}

	public Dvd(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda, String diretor, String duracao, String censura) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);

		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public void listarProduto(){
		JOptionPane.showMessageDialog(null, "Descricao: " + this.getDescricao() + "\nGenero: " + this.getGenero() + "\nEstoque: " + this.getEstoqueDisponivel() + "\nDiretor: " + this.getDiretor() + "\nDuracao: " + this.getDuracao() + "\nCensura: " + this.getCensura() + "\nPreco de custo: " + this.getPrecoCusto() + "\nPreco de venda: " + this.getPrecoVenda());		
	}
	
	public void calcularPrecoVenda(double cotacaoDolar){
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Preco venda em Reais:" + this.getPrecoVenda() + "\nCotacao do dolar: " 
				        + cotacaoDolar + "\nPreco de venda em Dolar:" + (this.getPrecoVenda() / cotacaoDolar));
	}

}

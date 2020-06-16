import javax.swing.JOptionPane;

// A classe Cd eh subclasse de Produto
public class Cd extends Produto {

	private String artista;
	private String gravadora;
	private String paisOrigem;
	
	public Cd() {
		this("","",0,0,0,"","","");
	}
	public Cd(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda, String artista, String gravadora, String paisOrigem) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);

		this.artista = artista;
		this.gravadora = gravadora;
		this.paisOrigem = paisOrigem;	
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	public void listarProduto(){
		JOptionPane.showMessageDialog(null, "Descricao: " + this.getDescricao() + "\nGenero: " + this.getGenero() + "\nEstoque: " + this.getEstoqueDisponivel() + "\nArtista: " + this.getArtista() + "\nGravadora: " + this.getGravadora() + "\nPais de origem: " + this.getPaisOrigem() + "\nPreco de custo: " + this.getPrecoCusto() + "\nPreco de venda: " + this.getPrecoVenda());		
	}

	public void calcularPrecoVenda(){
		// Apresenta o estoque atual e o estoque ja reajustado
		JOptionPane.showMessageDialog(null, "Preco venda anterior:" + this.getPrecoVenda() 
				+ "\nPorcentagem aplicada: 15%" + "\nPreco de venda atual:" + (this.getPrecoVenda() * 1.15));
		// Atribui o resultado da subtracao do atributo estoqueDisponivel		
		this.setPrecoVenda(this.getPrecoVenda() * 1.15);		
	}

	
}

package Modell;

public class ItemMovimentacao {
	
	private Produto produto;
	private int qtde;
	private double totalItem;
	
	public ItemMovimentacao() {
		this(null, 0, 0);
	}
	
	public ItemMovimentacao(Produto produto, int qtde, double totalItem) {
		this.produto = produto;
		this.qtde = qtde;
		this.totalItem = totalItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(double totalItem) {
		this.totalItem = totalItem;
	}
	
	public double totalizarItemCompra(){
		
		return produto.getVlUnitCompra() * qtde;
		
	}

	public double totalizarItemVenda(){
		
		return produto.getVlUnitVenda() * qtde;
		
	}

}

package Modell;

import java.util.Date;

public class Movimentacao {

	private int nf;
	private Date data;
	private Pessoa cliForn;
	private String tipo;
	private ItemMovimentacao item[];
	
	public Movimentacao() {
		this(0,null,null,"",null);
	}	
	
	public Movimentacao(int nf, Date data, Pessoa cliForn, String tipo,	ItemMovimentacao[] item) {
		this.nf = nf;
		this.data = data;
		this.cliForn = cliForn;
		this.tipo = tipo;
		this.item = item;
	}

	public int getNf() {
		return nf;
	}

	public void setNf(int nf) {
		this.nf = nf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Pessoa getCliForn() {
		return cliForn;
	}

	public void setCliForn(Pessoa cliForn) {
		this.cliForn = cliForn;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ItemMovimentacao[] getItem() {
		return item;
	}

	public void setItem(ItemMovimentacao[] item) {
		this.item = item;
	}
	
	public void incluirItem(){
		// instancia um objeto itemMovimentacao
		// alimenta-o com dados do form
		// inclui no array
	}
	
	public void excluirItem(){
		// procura/localiza o item
		// exclui do array
	}
	
	public double totalizarMovimentacao(){
		
		// Percorre o array de itens e totaliza o atributo valor 
		// de compra ou  de venda dependento do tipo da movimentacao
		return 0;
	}
	
}

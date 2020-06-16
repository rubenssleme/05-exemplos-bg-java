package com.aprendaefaca.gerenciamentobancario.modelos;

public class Produto {
	
	private int codigo;
	private String descricao;
	private int quantidade;
	private double vlUnitCompra;
	private double vlUnitVenda;
	
	public Produto(){
		this(0,"",0,0d,0d);
	}

	public Produto(int codigo, String descricao, int quantidade, double vlUnitCompra, double vlUnitVenda) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.vlUnitCompra = vlUnitCompra;
		this.vlUnitVenda = vlUnitVenda;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getVlUnitCompra() {
		return vlUnitCompra;
	}

	public void setVlUnitCompra(double vlUnitCompra) {
		this.vlUnitCompra = vlUnitCompra;
	}

	public double getVlUnitVenda() {
		return vlUnitVenda;
	}

	public void setVlUnitVenda(double vlUnitVenda) {
		this.vlUnitVenda = vlUnitVenda;
	}
	
}

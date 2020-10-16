package br.com.rubensleme;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompra {
	private Map<Produto, Integer> produtos; 


	public CarrinhoDeCompra() {
		produtos = new HashMap<Produto, Integer>();
	}

	public void  adicionarProduto(Produto produto, int quantidade){
		boolean retorno = false; 
		if(possuiProduto(produto)){
		Integer quantidadeObtida	= produtos.get(produto);
		Integer quantidadeTotal = quantidadeObtida + quantidade;
		atualizarProduto(produto,quantidadeTotal );
		}
	}
	public boolean possuiProduto(Produto produto){

		return produtos.containsKey(produto);
	}
	
	public boolean atualizarProduto(Produto produto, int quantidade){
		Integer retorno = produtos.put(produto, quantidade);
		return retorno != null;
	}
	
	public boolean removerProduto(Produto produto, int quantidade){
	  return this.produtos.remove(produto, quantidade);	
	}
	
	public Double obterValorTotalDeCompra(){
	
		Double valorTotalDaCompra = this.produtos.keySet().stream().mapToDouble(produto -> produto.getPreco()).sum();
		
		return valorTotalDaCompra;
	}
		

	

}

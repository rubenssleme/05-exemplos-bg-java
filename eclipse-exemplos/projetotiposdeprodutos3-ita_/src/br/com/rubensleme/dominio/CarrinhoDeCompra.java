package br.com.rubensleme.dominio;

import java.util.HashMap;
import java.util.Map;

import br.com.rubensleme.dominio.Produto;

public class CarrinhoDeCompra {
	private Map<Produto, Integer> produtos;

	public CarrinhoDeCompra() {
		produtos = new HashMap<Produto, Integer>();
	}

	public boolean adicionarProduto(Produto produto, Integer quantidade) {
		boolean retorno = false;
		if (possuiProduto(produto)) {
			Integer quantidadeTotal = obterQuantidade(produto) + quantidade;
			retorno = atualizarProduto(produto, quantidadeTotal);
		} else {
			retorno = atualizarProduto(produto, quantidade);
		}
		return retorno;
	}

	private boolean atualizarProduto(Produto produto, Integer quantidade) {
		Integer retorno = this.produtos.put(produto, quantidade);
		return retorno != null;
	}

	public int obterQuantidade(Produto produto) {
		return this.produtos.get(produto);
	}

	private boolean possuiProduto(Produto produto) {
		return this.produtos.containsKey(produto);
	}

	public boolean removerProduto(Produto produto, Integer quantidade) {
		boolean retorno = false;
		
		if (quantidade >= 0) {
			if (possuiProduto(produto)) {
				Integer quantidadeTotal = quantidade - obterQuantidade(produto);
				if (quantidadeTotal >= 0) {
					retorno = atualizarProduto(produto, quantidadeTotal);
				}
			} else {
				retorno = atualizarProduto(produto, quantidade);
			}
		}
		return retorno;
	}

	public Double obterValorTotalCompra() {
		Double precoTotal = this.produtos.keySet().stream().mapToDouble(produto -> produto.getPreco()).sum();
		Integer quantidadeTotal = this.produtos.entrySet().stream().mapToInt(quantidade -> quantidade.getValue()).sum();

		double valorTotalCompra = quantidadeTotal * precoTotal;

		return valorTotalCompra;
	}

	public Map<Produto, Integer> obterProdutos() {
		return produtos;
	}

	public int obterQuantidadeProdutos() {
		return produtos.size();
	}

}

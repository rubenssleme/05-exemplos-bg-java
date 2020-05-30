package br.com.rubensleme.projetoTiposDeProdutos2;

import org.junit.Test;

import br.com.rubensleme.projetoTiposDeProdutos2.dominio.CarrinhoDeCompra;
import br.com.rubensleme.projetoTiposDeProdutos2.dominio.ProdutoComTamanho;
import junit.framework.Assert;

public class TestesCarrinhoDeCompra {

	@Test
	public void testes_carrinho_de_compra_soma_quantidade_de_produto_existente() {
		Integer quantidade = 20;
		int quantidadeProdutosAdicionados = 2;

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

		ProdutoComTamanho produto = new ProdutoComTamanho();
		produto.setCodigo(1L);
		produto.setNome("TENIS X");
		produto.setPreco(999.0);
		produto.setTamanho(42);

		ProdutoComTamanho segundoProduto = new ProdutoComTamanho();
		segundoProduto.setCodigo(1L);
		segundoProduto.setNome("TENIS X");
		segundoProduto.setPreco(999.0);
		segundoProduto.setTamanho(42);

		carrinhoDeCompra.adicionarProduto(produto, quantidade);
		carrinhoDeCompra.adicionarProduto(produto, quantidade);

		int quantidadeTotal = quantidade * quantidadeProdutosAdicionados;

		Assert.assertEquals(quantidadeTotal, carrinhoDeCompra.obterQuantidade(produto));
	}

	@Test
	public void testes_carrinho_de_compra_obtem_valor_total_de_produtos_iguais_sem_sucesso() {
		Integer quantidadeProduto = 1;
		int tamanho = 32;
		int segundoTamanho = 32;
		int terceiroTamanho = 32;
		int quartoTamanho = 32;
		Long codigo = 1L;
		String nome = "Tenis X";
		Double preco = 100.0;

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

		ProdutoComTamanho primeiroProdutoComTamanho = new ProdutoComTamanho();

		primeiroProdutoComTamanho.setCodigo(codigo);
		primeiroProdutoComTamanho.setNome(nome);
		primeiroProdutoComTamanho.setPreco(preco);
		primeiroProdutoComTamanho.setTamanho(tamanho);

		ProdutoComTamanho segundoProdutoComTamanho = new ProdutoComTamanho();

		segundoProdutoComTamanho.setCodigo(codigo);
		segundoProdutoComTamanho.setNome(nome);
		segundoProdutoComTamanho.setPreco(preco);
		segundoProdutoComTamanho.setTamanho(segundoTamanho);

		ProdutoComTamanho terceiroProdutoComTamanho = new ProdutoComTamanho();

		terceiroProdutoComTamanho.setCodigo(codigo);
		terceiroProdutoComTamanho.setNome(nome);
		terceiroProdutoComTamanho.setPreco(preco);
		terceiroProdutoComTamanho.setTamanho(terceiroTamanho);

		ProdutoComTamanho quartoProdutoComTamanho = new ProdutoComTamanho();

		quartoProdutoComTamanho.setCodigo(codigo);
		quartoProdutoComTamanho.setNome(nome);
		quartoProdutoComTamanho.setPreco(preco);
		quartoProdutoComTamanho.setTamanho(quartoTamanho);

		carrinhoDeCompra.adicionarProduto(primeiroProdutoComTamanho, quantidadeProduto);
		carrinhoDeCompra.adicionarProduto(segundoProdutoComTamanho, quantidadeProduto);
		carrinhoDeCompra.adicionarProduto(terceiroProdutoComTamanho, quantidadeProduto);
		carrinhoDeCompra.adicionarProduto(quartoProdutoComTamanho, quantidadeProduto);

		Assert.assertEquals(400.0, carrinhoDeCompra.obterValorTotalCompra());
		Assert.assertEquals(1, carrinhoDeCompra.obterQuantidadeProdutos());
	}

	@Test
	public void testes_carrinho_de_compra_obtem_valor_total_de_produtos_diferentes_com_sucesso() {
		Integer quantidadeProduto = 1;
		int tamanho = 34;
		int segundoTamanho = 32;
		int terceiroTamanho = 31;
		int quartoTamanho = 33;
		Long codigo = 1L;
		String nome = "Tenis X";
		Double preco = 100.0;

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

		ProdutoComTamanho primeiroProdutoComTamanho = new ProdutoComTamanho();

		primeiroProdutoComTamanho.setCodigo(codigo);
		primeiroProdutoComTamanho.setNome(nome);
		primeiroProdutoComTamanho.setPreco(preco);
		primeiroProdutoComTamanho.setTamanho(tamanho);

		ProdutoComTamanho segundoProdutoComTamanho = new ProdutoComTamanho();

		segundoProdutoComTamanho.setCodigo(codigo);
		segundoProdutoComTamanho.setNome(nome);
		segundoProdutoComTamanho.setPreco(preco);
		segundoProdutoComTamanho.setTamanho(segundoTamanho);

		ProdutoComTamanho terceiroProdutoComTamanho = new ProdutoComTamanho();

		terceiroProdutoComTamanho.setCodigo(codigo);
		terceiroProdutoComTamanho.setNome(nome);
		terceiroProdutoComTamanho.setPreco(preco);
		terceiroProdutoComTamanho.setTamanho(terceiroTamanho);

		ProdutoComTamanho quartoProdutoComTamanho = new ProdutoComTamanho();

		quartoProdutoComTamanho.setCodigo(codigo);
		quartoProdutoComTamanho.setNome(nome);
		quartoProdutoComTamanho.setPreco(preco);
		quartoProdutoComTamanho.setTamanho(quartoTamanho);

		carrinhoDeCompra.adicionarProduto(primeiroProdutoComTamanho, quantidadeProduto);
		carrinhoDeCompra.adicionarProduto(segundoProdutoComTamanho, quantidadeProduto);
		carrinhoDeCompra.adicionarProduto(terceiroProdutoComTamanho, quantidadeProduto);
		carrinhoDeCompra.adicionarProduto(quartoProdutoComTamanho, quantidadeProduto);

		Assert.assertEquals(1600.0, carrinhoDeCompra.obterValorTotalCompra());
		Assert.assertEquals(4, carrinhoDeCompra.obterQuantidadeProdutos());
	}

	@Test
	public void testes_carrinho_de_compra_remove_produto_com_sucesso() {
		Integer quantidade = 30;
		int tamanho = 34;
		Long codigo = 1L;
		String nome = "Tenis X";
		Double preco = 99.9;

		ProdutoComTamanho produtoComTamanho = new ProdutoComTamanho();

		produtoComTamanho.setCodigo(codigo);
		produtoComTamanho.setNome(nome);
		produtoComTamanho.setPreco(preco);
		produtoComTamanho.setTamanho(tamanho);

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

		carrinhoDeCompra.adicionarProduto(produtoComTamanho, quantidade);

		boolean removido = carrinhoDeCompra.removerProduto(produtoComTamanho, quantidade);

		Assert.assertTrue(removido);
		Assert.assertEquals(carrinhoDeCompra.obterQuantidadeProdutos(), 1);
		Assert.assertEquals(carrinhoDeCompra.obterQuantidade(produtoComTamanho), 0);
	}

}

package br.com.carloskafka.projetoTiposDeProdutos2;

import org.junit.Test;

import br.com.carloskafka.projetoTiposDeProdutos2.dominio.ProdutoComTamanho;
import junit.framework.Assert;

public class TestesProdutoComTamanho {


	@Test
	public void testes_verifica_se_produto_com_mesmo_codigo_e_tamanhos_diferentes_sao_diferentes() {
		Long codigo = 1L;
		String nome = "TENIS LACOSTE";
		Double preco = 236.89;
		int primeiroTamanho = 40;
		int segundoTamanho = 42;
		
		ProdutoComTamanho produtoComTamanho = new ProdutoComTamanho();
		
		produtoComTamanho.setCodigo(codigo);
		produtoComTamanho.setNome(nome);
		produtoComTamanho.setPreco(preco);
		produtoComTamanho.setTamanho(primeiroTamanho);
		
		ProdutoComTamanho segundoProdutoComTamanho = new ProdutoComTamanho();
		
		segundoProdutoComTamanho.setCodigo(codigo);
		segundoProdutoComTamanho.setNome(nome);
		segundoProdutoComTamanho.setPreco(preco);
		segundoProdutoComTamanho.setTamanho(segundoTamanho);
		
		Assert.assertNotSame(produtoComTamanho, segundoProdutoComTamanho);
	}
	
}

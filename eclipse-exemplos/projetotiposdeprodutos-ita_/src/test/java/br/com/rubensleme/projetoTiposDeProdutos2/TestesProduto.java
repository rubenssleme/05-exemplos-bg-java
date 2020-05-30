package br.com.rubensleme.projetoTiposDeProdutos2;

import org.junit.Test;

import br.com.rubensleme.projetoTiposDeProdutos2.dominio.Produto;
import junit.framework.Assert;

public class TestesProduto {

	@Test
	public void verifica_se_produtos_sao_iguais_por_codigo() {
		Long codigo = 1L;
		String nome = "Tenis X";
		Double preco = 189.99;
		
		Produto produto = new Produto();
				
		produto.setCodigo(codigo);
		produto.setNome(nome);
		produto.setPreco(preco);

		Produto segundoProduto = new Produto();
		
		segundoProduto.setCodigo(codigo);
		segundoProduto.setNome(nome);
		segundoProduto.setPreco(preco);
		
		Assert.assertEquals(produto, segundoProduto);
	}
	
}

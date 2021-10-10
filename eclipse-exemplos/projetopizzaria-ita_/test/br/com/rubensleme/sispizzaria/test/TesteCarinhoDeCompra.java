package br.com.rubensleme.sispizzaria.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rubensleme.sispizzaria.CarrinhoDeCompra;
import br.com.rubensleme.sispizzaria.Pizza;

public class TesteCarinhoDeCompra {
	@Before
	public  void ZeraRegistroDeIngredientes(){
		Pizza.zeraIngredientes();
	}

	@Test
	public void testeVerificaSeOPrecoDasPizzasSaoSomadosCorretamente() {
		Pizza p = new Pizza();
		p.adicionarIngrediente("Queijo");
		p.adicionarIngrediente("Tomate");
		p.adicionarIngrediente("Azeitona");
		
		Pizza p1 = new Pizza();
		p1.adicionarIngrediente("Queijo");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Azeitona");
		p1.adicionarIngrediente("Azeitona");
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		
		carrinhoDeCompra.adicionarPizza(p);
		carrinhoDeCompra.adicionarPizza(p1);
		
		Assert.assertTrue( 46.0  ==  carrinhoDeCompra.obterTotalPizzas());
		
	}
	
	@Test
	public void impedeAdicaoDeUmaPizzaSemIngredientes(){
		Pizza p = new Pizza();
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		
		Assert.assertFalse(p.possuiIngredientes());
		 
		 Assert.assertEquals(0, carrinhoDeCompra.obterQuantidadePizzas());
		
	}
	

}

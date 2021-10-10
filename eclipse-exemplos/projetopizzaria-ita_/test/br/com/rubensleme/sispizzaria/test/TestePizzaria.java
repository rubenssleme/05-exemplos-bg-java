package br.com.rubensleme.sispizzaria.test;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rubensleme.sispizzaria.Pizza;

public class TestePizzaria {
	
	@Before
	public  void ZeraRegistroDeIngredientes(){
		Pizza.zeraIngredientes();
	}
	@Test
	public void testeVerifiqueSeRegistroDeIngredientesEValido() {

		Pizza p = new Pizza();
		p.adicionarIngrediente("Tomate");
		p.adicionarIngrediente("Tomate");
		p.adicionarIngrediente("Tomate");

		Pizza p2 = new Pizza();
		p2.adicionarIngrediente("Tomate");
		p2.adicionarIngrediente("Tomate");
		Assert.assertEquals(5, Pizza.obterQuantidadeIngredientesGastos()); 
	}
	@Test
	public void testeVerifiqueSeValorDaPizzaEIgualQuinze() {
		Pizza p1 = new Pizza();
		
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");

		Assert.assertTrue(15.0 == p1.getPreco());
	}
	
	@Test
	public void testeVerifiqueSeValorDaPizzaEIgualVinte() {
		Pizza p1 = new Pizza();
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");

		Assert.assertTrue(20.0 == p1.getPreco());
	}
	@Test
	public void testeVerifiqueSeValorDaPizzaEIgualVinteETres() {
		Pizza p1 = new Pizza();
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");
		p1.adicionarIngrediente("Tomate");

		Assert.assertTrue(23.0 == p1.getPreco());
	}


}

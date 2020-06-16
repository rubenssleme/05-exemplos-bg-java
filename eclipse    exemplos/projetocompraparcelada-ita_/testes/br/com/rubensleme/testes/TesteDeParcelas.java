package br.com.rubensleme.testes;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import org.junit.Test;
import br.com.rubensleme.CompraParcelada;

public class TesteDeParcelas {
	
	
	

	@Test
	public void testeDeUmaParcela() {
		CompraParcelada compra = new CompraParcelada(new BigDecimal(500.00), 1, new BigDecimal(0.01));
		assertEquals(new BigDecimal("505.00"), compra.obterValorTotalDaCompra());
	}
	
	@Test
	public void testeDeDuasParcelas() {
		CompraParcelada compra = new CompraParcelada(new BigDecimal(500.00), 2, new BigDecimal(0.01));
		
		assertEquals(new BigDecimal("510.05"), compra.obterValorTotalDaCompra());
		
	}
	@Test
	public void testeDeCincoParcelas() {
		CompraParcelada compra = new CompraParcelada(new BigDecimal(500.00), 5, new BigDecimal(0.01));
		
		assertEquals(new BigDecimal("525.51"), compra.obterValorTotalDaCompra());
		
	}
	@Test
	public void testeDeDezParcelas() {
		CompraParcelada compra = new CompraParcelada(new BigDecimal(500.00), 10, new BigDecimal(0.01));
		
		assertEquals(new BigDecimal("552.31"), compra.obterValorTotalDaCompra());
		
	}

}

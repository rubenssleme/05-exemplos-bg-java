package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carros.CarroSoma;
import carros.CarroDeCorrida;

public class TesteCarroSoma {
	CarroDeCorrida c ;
	@Before
	public void inicializaCarro(){
		 c = new CarroSoma("Teste",10,100);
	}

	@Test
	public void testeCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testeAcelerarCarro() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	@Test
	public void testeFrearCarro() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	@Test
	public void testeFrearCarroAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	@Test
	public void testeAcelerarCarroAteVelocidadeMaxima() {
		for(int i=0; i<14; i++)
		c.acelerar();
		assertEquals(100, c.getVelocidade());
	}
	

}

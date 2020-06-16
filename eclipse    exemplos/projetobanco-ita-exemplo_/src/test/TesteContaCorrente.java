package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.rubensleme.ContaCorrente;


public class TesteContaCorrente {
	ContaCorrente contaCorrente;
	@Before
	public void inicializarConta(){
		contaCorrente =  new ContaCorrente();
		contaCorrente.depositar(200);
	}

	@Test
	public void testeDepositarComSaldoNaConta() {
		assertEquals(200, contaCorrente.getSaldo());
	}
	
	@Test
	public void testeSaqueComSaldoNaConta() {
		int valorSacado = contaCorrente.sacar(50);
		
		assertEquals(150, contaCorrente.getSaldo());
		assertEquals(valorSacado, 50);
	}
	@Test
	public void testeSaqueMaiorQueSaldoNaConta() {
		int valorSacado = contaCorrente.sacar(250);
		
		assertEquals(200, contaCorrente.getSaldo());
		assertEquals(valorSacado, 0);	
	}

}

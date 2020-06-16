package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.rubensleme.ContaCorrente;
import br.com.rubensleme.ContaEspecial;

public class TesteContaEspecial extends TesteContaCorrente {
	
	
	@Before
	public void inicializarConta(){
		contaCorrente =  new ContaEspecial(100);
		contaCorrente.depositar(200);
	}
	@Test
	public void testeSaqueMaiorQueSaldoNaConta() {
		int valorSacado = contaCorrente.sacar(350);
		
		assertEquals(200, contaCorrente.getSaldo());
		assertEquals(valorSacado, 0);	
	}
}

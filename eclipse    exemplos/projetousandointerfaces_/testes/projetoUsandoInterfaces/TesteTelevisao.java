package projetoUsandoInterfaces;

import static org.junit.Assert.*;
import org.junit.Test;



public class TesteTelevisao {

	@Test
	public void testa_se_o_televisor_liga() {
		ModeloTVSDX tvsdx = new ModeloTVSDX(40);
		
		assertEquals(true, tvsdx.ligar(false));
	}
	@Test
	public void testa_se_o_televisor_comum_liga() {
		
		ModeloTVComum tvcomum = new ModeloTVComum(40);
		
		assertEquals(true, tvcomum.ligar(true));
	}

}

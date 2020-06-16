package br.laramara.ti.sisweb.utilitarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestesTextoUtils {
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_anula_string_inexistente() {
		String texto = null;

		Assert.assertNull(TextoUtils
				.removerCaracteresInvalidosEAnularVazio(texto));
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_remove_espaco_texto() {
		String texto = "AA AA";

		Assert.assertEquals(
				TextoUtils.removerCaracteresInvalidosEAnularVazio(texto),
				"AAAA");
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_anula_vazio() {
		String texto = "";

		Assert.assertNull(TextoUtils.anularVazio(texto));
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_texto_vazio() {
		String texto = "";

		Assert.assertTrue(TextoUtils.estaVazio(texto));
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_remover_chave() {
		String texto = "123[4]5";

		Assert.assertEquals("12345", TextoUtils.removerChaves(texto));
	}

	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_remover_virgula_final() {
		String texto = "Frei, Betto, ";

		Assert.assertEquals("Frei, Betto",
				TextoUtils.removerVirgulaFinal(texto));
	}
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_obtem_palavras() {
		String texto = "REEDUCACAO: QUALIDADE, PRODUTIVIDADE , CRIATIVIDADE";
		
		String[] palavras = (String[]) TextoUtils.obterPalavras(texto);
		int quantidade = palavras.length;
		
		Assert.assertEquals(quantidade, 4);
	}
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_obtem_palavras_de_id() {
		Long id = new Long(1);
		
		Object[] palavras = (Object[]) TextoUtils.obterPalavras(id);
		int quantidade = palavras.length;
		
		Assert.assertEquals(palavras[0], id);
		Assert.assertEquals(quantidade, 1);
	}
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void textoutils_obtem_palavras_de_status() {
		boolean status = true;
		
		Object[] palavras = (Object[]) TextoUtils.obterPalavras(status);
		int quantidade = palavras.length;

		Assert.assertEquals(palavras[0], status);
		Assert.assertEquals(quantidade, 1);
	}
}

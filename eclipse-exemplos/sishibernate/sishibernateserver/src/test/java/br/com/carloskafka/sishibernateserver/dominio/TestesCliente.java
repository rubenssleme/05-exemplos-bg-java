package br.com.carloskafka.sishibernateserver.dominio;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;
import br.com.carloskafka.sishibernateserver.fabricas.ContextoCliente;
import br.com.carloskafka.sishibernateserver.fabricas.ContextoGenerico;

public class TestesCliente {
	@Test
	public void cliente_validacao_sem_erro_de_obrigatoriedade_de_dados() {
		Cliente cliente = ContextoCliente.construirClienteComTodosOsDados();
		cliente.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertTrue(cliente.validado());
	}

	@Test
	public void cliente_validacao_com_erro_de_obrigatoriedade_de_dados() {
		Cliente cliente = new Cliente();
		cliente.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertFalse(cliente.validado());
		Assert.assertNotNull(cliente.obterDescricaoErros());
		Assert.assertEquals(cliente.obterNumeroErros(), 5,
				"Deveria haver 5 infrações de obrigatoriedade.");
	}

	@Test
	public void cliente_validacao_com_erro_de_tamanho_maximo_de_dados() {
		String textoGrande = ContextoGenerico.obterGrande();
		
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome(textoGrande);
		cliente.setCnpj(textoGrande);
		cliente.setRazaoSocial(textoGrande);
		cliente.setEmail(textoGrande);
		cliente.setTelefone("1111111111111");
		cliente.setVersao("");
		
		cliente.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertFalse(cliente.validado());
		Assert.assertNotNull(cliente.obterDescricaoErros());
		Assert.assertEquals(cliente.obterNumeroErros(), 4,
				"Deveria haver 3 infrações de tamanho maximo de dados.");
	}

}

package br.laramara.ti.sisweb.fabricas;

import org.testng.annotations.Test;

import br.laramara.ti.sisweb.sislivros.dtos.EspecificacaoPesquisaLivroDTO;
import br.laramara.ti.sisweb.sislivros.fabricas.FabricaEspecificacaoPesquisaLivro;
import br.laramara.ti.sisweb.sislivros.repositorios.EspecificacaoPesquisaLivro;
import junit.framework.Assert;

public class TestesFabricaEspecificacaoPesquisaLivro {
	@Test
	public void fabrica_especificacao_pesquisa_livro_converte_objeto_de_dto_para_dominio() {
		EspecificacaoPesquisaLivroDTO especificacaoPesquisaLivroDto = ContextoEspecificacaoPesquisaLivro.construirEspecificacaoPesquisaLivroDTO();		
		EspecificacaoPesquisaLivro especificacaoPesquisaLivro = new FabricaEspecificacaoPesquisaLivro().converterParaDominio(especificacaoPesquisaLivroDto);
		
		Assert.assertEquals(especificacaoPesquisaLivro.getId().toString(), especificacaoPesquisaLivroDto.getId());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemTitulo(), especificacaoPesquisaLivroDto.getContemTitulo());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemAutor(), especificacaoPesquisaLivroDto.getContemAutor());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemAssunto(), especificacaoPesquisaLivroDto.getContemAssunto());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemLocalArmazenado(), especificacaoPesquisaLivroDto.getContemLocalArmazenado());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemAaat(), especificacaoPesquisaLivroDto.getContemAaat());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemVolume(), especificacaoPesquisaLivroDto.getContemVolume());
		Assert.assertEquals(especificacaoPesquisaLivro.getContemTipo(), especificacaoPesquisaLivroDto.getContemTipo());
		Assert.assertEquals(especificacaoPesquisaLivro.isStatus(), especificacaoPesquisaLivroDto.isStatus());
	}
	
	@Test
	public void fabrica_especificacao_pesquisa_livro_converte_objeto_de_dominio_para_dto() {				
		EspecificacaoPesquisaLivro especificacaoPesquisaLivro = new EspecificacaoPesquisaLivro();
		especificacaoPesquisaLivro.setContemTitulo("TESTE");
		EspecificacaoPesquisaLivroDTO especificacaoPesquisaLivroDto = new FabricaEspecificacaoPesquisaLivro().converterParaDTO(especificacaoPesquisaLivro);
		
		Assert.assertNull(especificacaoPesquisaLivroDto);
	}
}

package br.laramara.ti.sisweb.fabricas;

import br.laramara.ti.sisweb.sislivros.dtos.EspecificacaoPesquisaLivroDTO;

public class ContextoEspecificacaoPesquisaLivro {
	public static EspecificacaoPesquisaLivroDTO construirEspecificacaoPesquisaLivroDTO() {
		EspecificacaoPesquisaLivroDTO especificacaoPesquisaLivroDto = new EspecificacaoPesquisaLivroDTO();
		especificacaoPesquisaLivroDto.setId("1");
		especificacaoPesquisaLivroDto.setContemTitulo("TITULO");
		especificacaoPesquisaLivroDto.setContemAutor("AUTOR");
		especificacaoPesquisaLivroDto.setContemAssunto("ASSUNTO");
		especificacaoPesquisaLivroDto.setContemLocalArmazenado("LOCAL ARMAZENADO");
		especificacaoPesquisaLivroDto.setContemAaat("AAAT");
		especificacaoPesquisaLivroDto.setContemVolume("VOLUME");
		especificacaoPesquisaLivroDto.setContemTipo("TIPO");
		especificacaoPesquisaLivroDto.setStatus(true);
		
		return especificacaoPesquisaLivroDto;
	}
}

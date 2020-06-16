package br.laramara.ti.sisweb.sislivros.fabricas;

import br.laramara.ti.sisweb.fabricas.FabricaBase;
import br.laramara.ti.sisweb.sislivros.dtos.EspecificacaoPesquisaLivroDTO;
import br.laramara.ti.sisweb.sislivros.repositorios.EspecificacaoPesquisaLivro;

public class FabricaEspecificacaoPesquisaLivro extends
		FabricaBase<EspecificacaoPesquisaLivroDTO, EspecificacaoPesquisaLivro> {

	@Override
	public EspecificacaoPesquisaLivroDTO converterParaDTO(
			EspecificacaoPesquisaLivro EspecificacaoPesquisaLivro) {
		return null;
	}

	@Override
	public EspecificacaoPesquisaLivro converterParaDominio(
			EspecificacaoPesquisaLivroDTO especificacaoPesquisaLivroDto) {
		EspecificacaoPesquisaLivro especificacaoPesquisaLivro = null;
		if (especificacaoPesquisaLivroDto != null) {
			especificacaoPesquisaLivro = new EspecificacaoPesquisaLivro();
		}
		especificacaoPesquisaLivro.setId(especificacaoPesquisaLivroDto.getId());
		especificacaoPesquisaLivro
				.setContemTitulo(especificacaoPesquisaLivroDto
						.getContemTitulo());
		especificacaoPesquisaLivro.setContemAutor(especificacaoPesquisaLivroDto
				.getContemAutor());
		especificacaoPesquisaLivro
				.setContemAssunto(especificacaoPesquisaLivroDto
						.getContemAssunto());
		especificacaoPesquisaLivro
				.setContemLocalArmazenado(especificacaoPesquisaLivroDto
						.getContemLocalArmazenado());
		especificacaoPesquisaLivro.setContemAaat(especificacaoPesquisaLivroDto
				.getContemAaat());
		especificacaoPesquisaLivro
				.setContemVolume(especificacaoPesquisaLivroDto
						.getContemVolume());
		especificacaoPesquisaLivro.setContemTipo(especificacaoPesquisaLivroDto
				.getContemTipo());
		especificacaoPesquisaLivro.setStatus(especificacaoPesquisaLivroDto
				.isStatus());

		return especificacaoPesquisaLivro;
	}
}

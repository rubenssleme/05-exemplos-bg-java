package br.laramara.ti.sisweb.sislivros.dtos;

import br.laramara.ti.sisweb.dtos.ChavePesquisaDTO;
import br.laramara.ti.sisweb.dtos.EspecificacaoPesquisaDTO;

public class EspecificacaoPesquisaLivroDTO extends EspecificacaoPesquisaDTO {

	private static final long serialVersionUID = 4153187596713188405L;

	@Override
	protected void configurar() {
		adicionar(ChavePesquisaDTO.ID);
		adicionar(ChavePesquisaDTO.CONTEM_TITULO);
		adicionar(ChavePesquisaDTO.CONTEM_AUTOR);
		adicionar(ChavePesquisaDTO.CONTEM_ASSUNTO);
		adicionar(ChavePesquisaDTO.CONTEM_LOCAL_ARMAZENADO);
		adicionar(ChavePesquisaDTO.CONTEM_AAAT);
		adicionar(ChavePesquisaDTO.CONTEM_VOLUME);
		adicionar(ChavePesquisaDTO.CONTEM_TIPO);
	}

	public EspecificacaoPesquisaLivroDTO() {
		inicializarStatus();
	}

	private void inicializarStatus() {
		setStatus(true);
	}

	public String getId() {
		return (String) obterParametro(ChavePesquisaDTO.ID);
	}

	public void setId(String id) {
		adicionarParametro(ChavePesquisaDTO.ID, id);
	}

	public String getContemTitulo() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_TITULO);
	}

	public void setContemTitulo(String titulo) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_TITULO, titulo);
	}

	public String getContemAutor() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_AUTOR);
	}

	public void setContemAutor(String contemAutor) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_AUTOR, contemAutor);
	}

	public String getContemAssunto() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_ASSUNTO);
	}

	public void setContemAssunto(String contemAssunto) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_ASSUNTO, contemAssunto);
	}

	public String getContemLocalArmazenado() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_LOCAL_ARMAZENADO);
	}

	public void setContemLocalArmazenado(String contemLocalArmazenado) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_LOCAL_ARMAZENADO,
				contemLocalArmazenado);
	}

	public String getContemAaat() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_AAAT);
	}

	public void setContemAaat(String contemAaat) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_AAAT, contemAaat);
	}

	public String getContemVolume() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_VOLUME);
	}

	public void setContemVolume(String contemVolume) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_VOLUME, contemVolume);
	}

	public String getContemTipo() {
		return (String) obterParametro(ChavePesquisaDTO.CONTEM_TIPO);
	}

	public void setContemTipo(String contemTipo) {
		adicionarParametro(ChavePesquisaDTO.CONTEM_TIPO, contemTipo);
	}

	public boolean isStatus() {
		return (boolean) obterParametro(ChavePesquisaDTO.STATUS);
	}

	public void setStatus(boolean status) {
		adicionarParametro(ChavePesquisaDTO.STATUS, status);
	}

}

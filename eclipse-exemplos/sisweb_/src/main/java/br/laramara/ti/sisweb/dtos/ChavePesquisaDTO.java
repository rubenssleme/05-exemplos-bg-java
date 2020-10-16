package br.laramara.ti.sisweb.dtos;

import java.io.Serializable;

public enum ChavePesquisaDTO implements Serializable {
	ID("ID"),
	CONTEM_TITULO("Contem Titulo"),
	CONTEM_AUTOR("Contem Autor"),
	CONTEM_ASSUNTO("Contem Assunto"),
	CONTEM_LOCAL_ARMAZENADO("Contem Local Armazenado"),
	CONTEM_AAAT("Contem AAAT"),
	CONTEM_VOLUME("Contem Volume"),
	CONTEM_TIPO("Contem Tipo"),
	STATUS("Contem Status");
	
	private String descricao;

	private ChavePesquisaDTO(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
}
package br.com.rubensleme.projetoFormatadorNome.formatos;

import br.com.rubensleme.projetoFormatadorNome.dominio.FormatadorNome;
import br.com.rubensleme.projetoFormatadorNome.dominio.Sexo;

public class Respeitoso implements FormatadorNome {
	private Sexo sexo;

	public Respeitoso(Sexo sexo) {
		this.sexo = sexo;
	}

	public String formatarNome(String nome, String sobrenome) {
		return sexo.obterTratativa() + " " + sobrenome;
	}

}

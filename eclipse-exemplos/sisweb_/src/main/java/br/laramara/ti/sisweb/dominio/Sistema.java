package br.laramara.ti.sisweb.dominio;

import java.util.Comparator;

public enum Sistema {
	SISRH_ADMINISTRACAO, SISRH_ACESSAR_HOLERITE, 
	SISLIVROS_ADMINISTRACAO;
	
	public static final Comparator<Sistema> obterComparador() {
		return new Comparator<Sistema>() {
			public int compare(Sistema o1, Sistema o2) {
				return o1.toString().compareTo(o2.toString());
			}
		};
	}
}

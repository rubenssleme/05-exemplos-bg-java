package br.laramara.ti.sisweb.utilitarios;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Ordenador implements Comparator<String> {

	public int compare(String arquivoA, String arquivoB) {
		try {
			String dadosA[] = dados(arquivoA);
			String dadosB[] = dados(arquivoB);
			Calendar dataA = criar(dadosA[0], dadosA[1], dadosA[2]);
			Calendar dataB = criar(dadosB[0], dadosB[1], dadosB[2]);

			if (dataA.getTime().after(dataB.getTime())) {
				return -1;
			} else if (dataA.getTime().before(dataB.getTime())) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}

	private String[] dados(String arquivo) {
		return arquivo.replace(
				"."
						+ Configuracao.obterConfiguracao(this,
								Configuracao.EXTENSAO_RELATORIO), "")
				.split("-");
	}

	public static Calendar criar(String dia, String mes, String ano) {
		return new GregorianCalendar(Integer.parseInt(ano),
				Integer.parseInt(mes) - 1, Integer.parseInt(dia));
	}
}

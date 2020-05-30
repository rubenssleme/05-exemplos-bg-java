package br.com.conexao.utilitarios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FormatacaoBigDecimal {

	public BigDecimal FormatarBigDecimal(BigDecimal valor) {
		DecimalFormat df = new DecimalFormat("0.##");
		df.format(valor.setScale(2, RoundingMode.HALF_EVEN));
		valor.toString().replaceAll("[^\\d.]", "").trim();
		return valor;

	}
}

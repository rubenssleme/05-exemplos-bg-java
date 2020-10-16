package br.com.rubensleme;

import java.math.BigDecimal;

public class Compra {
private BigDecimal valorCompra;

	public Compra(BigDecimal valorCompra) {
		this.valorCompra  =  valorCompra;
	}

	public BigDecimal obterValorTotalDaCompra(){
			
		return valorCompra;
	}
	
	
}

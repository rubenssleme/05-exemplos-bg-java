package br.com.rubensleme;

import java.math.BigDecimal;

public class CompraParcelada extends Compra {
	private	Integer quantidadeParcelas;
	private BigDecimal  jurosMensal;

	public CompraParcelada(BigDecimal valorCompra,Integer quantidadeParcelas,BigDecimal jurosMensal) {
		super(valorCompra);
		this.quantidadeParcelas = quantidadeParcelas;
		this.jurosMensal = jurosMensal;
	}

	public BigDecimal valorDaParcela(){
		return (super.obterValorTotalDaCompra());
	}

	public BigDecimal valorDoJurosNaParcela(){
		return (valorDaParcela().multiply(jurosMensal));
	}

	@Override
	public BigDecimal obterValorTotalDaCompra() {

		BigDecimal valorTotalDaParcela = valorDaParcela();
		
		for(int p=1;p <= quantidadeParcelas; p++){
			BigDecimal soma = valorTotalDaParcela.multiply(jurosMensal);
			valorTotalDaParcela =	(valorTotalDaParcela.add(soma));
		}

		return valorTotalDaParcela.setScale(2,BigDecimal.ROUND_HALF_UP);
	}




}

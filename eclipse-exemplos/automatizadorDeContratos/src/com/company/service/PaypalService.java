package com.company.service;

public class PaypalService implements  OnlinePagamentoService{

    private static final double TAXA_PERCENTUAL = 0.02;
    private static final double JUROS_MENSAIS = 0.01;

    @Override
    public double taxaDePagamento(double montante) {
        return montante * TAXA_PERCENTUAL;
    }

    @Override
    public double jurosSimples(double montante, int meses) {
        return montante * JUROS_MENSAIS * meses;
    }
}

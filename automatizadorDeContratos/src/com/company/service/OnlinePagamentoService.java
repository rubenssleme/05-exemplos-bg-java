package com.company.service;


public interface OnlinePagamentoService {
    public double taxaDePagamento(double montante);
    public double jurosSimples(double montante, int meses);
}

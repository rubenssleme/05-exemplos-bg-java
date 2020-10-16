package com.company.service;

import com.company.entidade.Contrato;
import com.company.entidade.Parcela;

import java.util.Calendar;
import java.util.Date;


public class ContratoService {
    private OnlinePagamentoService onlinePagamentoService;

    public ContratoService(OnlinePagamentoService onlinePagamentoService) {
        this.onlinePagamentoService = onlinePagamentoService;
    }

    public void processarContrato(Contrato contrato, int meses){
        double quotaSimples = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            Date date = adicionarMes(contrato.getData(), i);
            double quotaAtualizada = quotaSimples + onlinePagamentoService.jurosSimples(quotaSimples, i);
            double QuotaTotal =  quotaAtualizada + onlinePagamentoService.taxaDePagamento(quotaAtualizada);

            contrato.adicionarParcela(new Parcela(date, QuotaTotal));
        }
    }

    private Date adicionarMes(Date data, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}

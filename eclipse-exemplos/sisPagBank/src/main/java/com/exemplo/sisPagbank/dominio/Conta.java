package com.exemplo.sisPagbank.dominio;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void creditarSaldo(double valor){
        this.saldo = (this.getSaldo()+valor);
    }

    public void debitarValidado(double valor) {

        if (this.saldo >= valor) {
            this.saldo = (this.getSaldo() - valor);
        } else {
            System.out.println("saldo insuficiente = " + this.getSaldo());
        }

    }

}

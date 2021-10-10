package com.rubensleme.services;

public class BrasilImpostoService implements ImpostoService{
    private double interestRate;

    public BrasilImpostoService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}

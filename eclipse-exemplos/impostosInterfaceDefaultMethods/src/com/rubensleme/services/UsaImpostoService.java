package com.rubensleme.services;

public class UsaImpostoService implements ImpostoService {

    private double interestRate;

    public UsaImpostoService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}

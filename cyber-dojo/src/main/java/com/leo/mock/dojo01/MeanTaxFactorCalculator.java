package com.leo.mock.dojo01;

import com.leo.mock.common.Person;

public class MeanTaxFactorCalculator {
    private final TaxService taxService;

    public MeanTaxFactorCalculator(TaxService taxService) {
        this.taxService = taxService;
    }

    public double calculateMeanTaxFactorFor(Person person) {
        double basicTaxFactor = taxService.getBasicTaxFactorFor(person);
        double doublePayTaxFactor = taxService.getDoublePayTaxFactorFor(person);
        return (basicTaxFactor + doublePayTaxFactor) / 2;
    }
}

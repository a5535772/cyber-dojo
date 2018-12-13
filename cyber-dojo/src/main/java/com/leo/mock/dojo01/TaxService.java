package com.leo.mock.dojo01;

import com.leo.mock.common.Person;

public interface TaxService {

    double getBasicTaxFactorFor(Person person);

	double getDoublePayTaxFactorFor(Person person);
}



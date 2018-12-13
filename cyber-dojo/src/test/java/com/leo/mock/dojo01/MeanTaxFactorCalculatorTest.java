package com.leo.mock.dojo01;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.leo.mock.common.Person;

@RunWith(MockitoJUnitRunner.class)
public class MeanTaxFactorCalculatorTest {

    static final double TAX_FACTOR = 10;

    @Mock TaxService taxService;

    @InjectMocks MeanTaxFactorCalculator systemUnderTest;

    @Test
    public void should_calculate_mean_tax_factor() {
        // given
        given(taxService.getBasicTaxFactorFor(any(Person.class))).willReturn(TAX_FACTOR);
        given(taxService.getDoublePayTaxFactorFor(any(Person.class))).willReturn(TAX_FACTOR);
        
        // when
        double meanTaxFactor = systemUnderTest.calculateMeanTaxFactorFor(new Person());

        // then
        then(meanTaxFactor).isEqualTo(TAX_FACTOR);
    }

}

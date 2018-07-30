package com.leo.cyber.dojo03.lcd.digits;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LcdDigitsTest {

	

	@Test
	public void should_print_zero() {
		final int[] numbers = { 0 };
		String[][] result = LcdDigits.printAndGet(numbers);
		assertThat(result).isEqualTo(LcdDigits.ZERO);
	}
}

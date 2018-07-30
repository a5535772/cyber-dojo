package com.leo.cyber.dojo03.lcd.digits;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class LcdDigitsTest {

	

	@Test
	public void should_print_zero() {
		final int[] numbers = { 0 };
		List<LCD> result = LcdDigits.printAndGet(numbers);
		assertThat(result.size()).isEqualTo(1);
		assertThat(result.get(0)).isEqualTo(LCD.ZERO);
	}
}

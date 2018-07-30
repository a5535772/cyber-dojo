package com.leo.cyber.dojo03.lcd.digits;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Random;

import org.junit.Test;

public class LcdDigitsTest {

	@Test
	public void should_print_zero() {
		final int[] numbers = { 0 };
		List<LCD> result = LcdDigits.printAndGet(numbers);
		assertThat(result.size()).isEqualTo(1);
		assertThat(result.get(0)).isEqualTo(LCD.ZERO);
	}

	@Test
	public void should_print_the_number() {
		int[] numbers = new int[1];
		numbers[0] = new Random().nextInt(9);
		List<LCD> result = LcdDigits.printAndGet(numbers);
		assertThat(result.size()).isEqualTo(1);
		assertThat(result.get(0)).isEqualTo(LCD.get(numbers[0]));
	}
}

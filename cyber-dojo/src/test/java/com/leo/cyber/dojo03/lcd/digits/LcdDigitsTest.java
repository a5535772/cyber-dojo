package com.leo.cyber.dojo03.lcd.digits;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Random;

import org.junit.Test;

public class LcdDigitsTest {

	@Test
	public void should_print_zero() {
		String localResult = constructLcdString(LCD.ZERO);
		String result = LcdDigits.printAndGet(new int[] { 0 });
		assertThat(result).isEqualTo(localResult);
	}

	@Test
	public void should_print_the_number() {
		int[] numbers = { new Random().nextInt(9) };
		String localResult = constructLcdString(LCD.get(numbers[0]));
		String result = LcdDigits.printAndGet(numbers);
		assertThat(result).isEqualTo(localResult);
	}

	@Test
	public void should_print_the_numbers() {
		int[] numbers = { 3, 5 };
		String localResult = constructLcdString(LCD.get(numbers));
		String result = LcdDigits.printAndGet(numbers);
		assertThat(result).isEqualTo(localResult);
	}

	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void should_throw_execption_when_number_is_bigger_than_zero() {
		LcdDigits.printAndGet(new int[] { new Random().nextInt(9)+10 });
	}

	private String constructLcdString(List<LCD> list) {

		StringBuilder sb = new StringBuilder();

		for (LCD lcd : list) {
			sb.append(lcd.getHeader()).append(LCD.LINE_SPACE);
		}
		sb.delete(sb.lastIndexOf(LCD.LINE_SPACE), sb.length());
		sb.append(LCD.LINE_SEPARATOR);
		for (LCD lcd : list) {
			sb.append(lcd.getBody()).append(LCD.LINE_SPACE);
		}
		sb.delete(sb.lastIndexOf(LCD.LINE_SPACE), sb.length());
		sb.append(LCD.LINE_SEPARATOR);
		for (LCD lcd : list) {
			sb.append(lcd.getFoot()).append(LCD.LINE_SPACE);
		}
		sb.delete(sb.lastIndexOf(LCD.LINE_SPACE), sb.length());
		return sb.toString();
	}

	private String constructLcdString(LCD zero) {
		StringBuilder sb = new StringBuilder().append(zero.getHeader()).append(LCD.LINE_SEPARATOR)
				.append(zero.getBody()).append(LCD.LINE_SEPARATOR).append(zero.getFoot());
		return sb.toString();
	}
}

package com.leo.cyber.dojo03.lcd.digits;

import java.util.List;

public class LcdDigits {
	private LcdDigits() {
	}

	public static List<LCD> printAndGet(int[] numbers) {
		List<LCD> result = LCD.get(numbers);
		printResult(result);
		return result;
	}

	private static void printResult(List<LCD> lcdList) {
		for (LCD lcd : lcdList) {
			lcd.printHeader();
			lcd.printBody();
			lcd.printFoot();
		}
	}

}

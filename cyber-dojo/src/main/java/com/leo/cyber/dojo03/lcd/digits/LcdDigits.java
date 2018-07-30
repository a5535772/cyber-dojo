package com.leo.cyber.dojo03.lcd.digits;

import java.util.List;

public class LcdDigits {
	private LcdDigits() {
	}

	public static String printAndGet(int[] numbers) {
		List<LCD> lcdList = LCD.get(numbers);
		String result = getPrintString(lcdList);
		System.out.println(result);
		return result;
	}

	private static String getPrintString(List<LCD> lcdList) {
		StringBuilder sb = new StringBuilder();
		appendHeader(lcdList, sb);
		appendBody(lcdList, sb);
		appendFoot(lcdList, sb);
		return sb.toString();
	}

	private static void appendFoot(List<LCD> lcdList, StringBuilder sb) {
		for (LCD lcd : lcdList) {
			sb.append(lcd.getFoot()).append(LCD.LINE_SPACE);
		}
		sb.delete(sb.lastIndexOf(LCD.LINE_SPACE), sb.length());
	}

	private static void appendBody(List<LCD> lcdList, StringBuilder sb) {
		for (LCD lcd : lcdList) {
			sb.append(lcd.getBody()).append(LCD.LINE_SPACE);
		}
		sb.delete(sb.lastIndexOf(LCD.LINE_SPACE), sb.length());
		sb.append(LCD.LINE_SEPARATOR);
	}

	private static void appendHeader(List<LCD> lcdList, StringBuilder sb) {
		for (LCD lcd : lcdList) {
			sb.append(lcd.getHeader()).append(LCD.LINE_SPACE);
		}
		sb.delete(sb.lastIndexOf(LCD.LINE_SPACE), sb.length());
		sb.append(LCD.LINE_SEPARATOR);
	}

}

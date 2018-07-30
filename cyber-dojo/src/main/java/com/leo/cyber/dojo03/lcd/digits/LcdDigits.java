package com.leo.cyber.dojo03.lcd.digits;

public class LcdDigits {
	private LcdDigits() {

	}
	public static final String[][] ZERO = {{".","_","."},{"|",".","|"},{"|","_","|"}};

	public static String[][] printAndGet(int[] numbers) {
		String[][] result = buildResult(numbers);
		printResult(result);
		return result;
	}

	private static String[][] buildResult(int[] numbers) {
		String [][] result =ZERO;
		return result;
	}

	private static void printResult(String[][] result) {
		for (int i = 0; i < result.length; i++) {
			StringBuilder line=new StringBuilder();
			for (int j = 0; j < result[i].length; j++) {
				line.append(result[i][j]);
			}
			System.out.println(line.toString());
		}
	}
	
	

}

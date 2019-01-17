package com.leo.cyber.dojo04.fizzbuzz;

public class FizzBuzz {
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";

	public String of(int number) {
		if (number <= 0 || number > 100) {
			throw new RuntimeException("参数异常");
		}
		StringBuilder sb = new StringBuilder();
		if (number % 3 == 0) {
			sb.append(FIZZ);
		}
		if (number % 5 == 0) {
			sb.append(BUZZ);
		}
		if (sb.length() == 0) {
			sb.append(number);
		}
		return sb.toString();
	}

}

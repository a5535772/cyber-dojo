package com.leo.cyber.dojo04.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz sut = new FizzBuzz();

	@Test
	public void 当输入为1时_返回1() {
		// given
		int one = 1;
		// when
		String result = sut.of(one);
		// then
		assertThat(result).isEqualTo(String.valueOf(one));
	}

	@Test
	public void 当输入为3时_返回Fizz() {
		// given
		int three = 3;
		// when
		String result = sut.of(three);
		// then
		assertThat(result).isEqualTo(FizzBuzz.FIZZ);
	}

	@Test
	public void 当输入为5时_返回Buzz() {
		// given
		int five = 5;
		// when
		String result = sut.of(five);
		// then
		assertThat(result).isEqualTo(FizzBuzz.BUZZ);
	}

	@Test
	public void 当输入为15时_返回FizzBuzz() {
		// given
		int number = 15;
		// when
		String result = sut.of(number);
		// then
		assertThat(result).isEqualTo(FizzBuzz.FIZZ + FizzBuzz.BUZZ);
	}

	@Test(expected = RuntimeException.class)
	public void 当输入为0时_抛出异常() {
		// given
		int zero = 0;
		// when
		sut.of(zero);
	}

	@Test(expected = RuntimeException.class)
	public void 当输入为101时_抛出异常() {
		// given
		int number = 101;
		// when
		sut.of(number);
	}
}

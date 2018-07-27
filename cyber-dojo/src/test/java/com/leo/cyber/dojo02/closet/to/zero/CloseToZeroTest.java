package com.leo.cyber.dojo02.closet.to.zero;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CloseToZeroTest {
	CloseToZero closeToZero = new CloseToZero();

	static final int ZERO = 0;

	@Test
	public void should_return_zero_when_zero_exists() {
		final int[] sourceArray = { -1, 0, 1 };
		int closest = closeToZero.chose(sourceArray);
		assertThat(closest).isEqualTo(ZERO);
	}

	@Test
	public void should_return_min_value_when_no_num_is_less_than_zero() {
		final int[] sourceArray = { 9, 88, 71, 2, 3, 5 };
		int closest = closeToZero.chose(sourceArray);
		assertThat(closest).isEqualTo(2);
	}

	@Test
	public void should_return_max_value_when_no_num_is_bigger_than_zero() {
		final int[] sourceArray = { -9, -88, -71, -2, -3, -5 };
		int closest = closeToZero.chose(sourceArray);
		assertThat(closest).isEqualTo(-2);
	}

	@Test
	public void should_return_positive() {
		final int[] sourceArray = { -1, 1 };
		int closest = closeToZero.chose(sourceArray);
		assertThat(closest).isEqualTo(1);
	}

	@Test
	public void should_return_closeast() {
		final int[] sourceArray = { -9, -88, -71, -2, -3, -5, 9, -1, 88, 71, 2, 3, 5 };
		int closest = closeToZero.chose(sourceArray);
		assertThat(closest).isEqualTo(-1);
	}
}

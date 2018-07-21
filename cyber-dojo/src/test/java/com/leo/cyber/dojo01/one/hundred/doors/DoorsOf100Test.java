package com.leo.cyber.dojo01.one.hundred.doors;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.leo.cyber.dojo01.one.hundred.doors.Doors;

public class DoorsOf100Test {

	@Test
	public void shoud_visit_100_times_and_max_is_100_when_seed_is_1() {
		List<Integer> list=Doors.getSwitchList(1);
		assertThat(list.size()).isEqualTo(100);
		assertThat(list.get(list.size()-1)).isEqualTo(100);
	}
}

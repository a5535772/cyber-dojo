package com.leo.cyber.dojo01.one.hundred.doors;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class DoorsOf100Test {

	@Test
	public void shoud_visit_100_times_and_max_is_100_when_seed_is_1() {
		List<Integer> list = Doors.getSwitchList(1);
		assertThat(list.size()).isEqualTo(100);
		assertThat(list.get(list.size() - 1)).isEqualTo(100);
	}

	@Test
	public void shoud_visit_50_times_and_max_is_100_when_seed_is_2() {
		List<Integer> list = Doors.getSwitchList(2);
		assertThat(list.size()).isEqualTo(50);
		assertThat(list.get(list.size() - 1)).isEqualTo(100);
	}

	@Test
	public void shoud_visit_33_times_and_max_is_99_when_seed_is_3() {
		List<Integer> list = Doors.getSwitchList(3);
		assertThat(list.size()).isEqualTo(33);
		assertThat(list.get(list.size() - 1)).isEqualTo(99);
	}

	@Test
	public void shoud_visit_1_times_and_max_is_100_when_seed_is_100() {
		List<Integer> list = Doors.getSwitchList(100);
		assertThat(list.size()).isEqualTo(1);
		assertThat(list.get(list.size() - 1)).isEqualTo(100);
	}

	@Test
	public void all_doors_should_be_open_when_visit_only_time() {
		List<Door> doors = Doors.visit(1);
		assertThat(doors.size()).isEqualTo(100);
		for (Door door : doors) {
			assertThat(door.getVisitTimes()).isEqualTo(1);
			assertThat(door.isOpen()).isTrue();
		}
	}

	@Test
	public void all_cardinal_doors_should_be_open_when_visit_2_time() {
		List<Door> doors = Doors.visit(2);
		assertThat(doors.size()).isEqualTo(100);
		for (Door door : doors) {
			assertThat(door.getVisitTimes()).isLessThan(3);
			if (door.getVisitTimes() == 2) {
				assertThat(door.isOpen()).isFalse();
			} else {
				assertThat(door.isOpen()).isTrue();
			}
		}
	}

	@Test
	public void all_cardinal_doors_should_be_open_when_visit_3_time() {
		List<Door> doors2 = Doors.visit(2);
		List<Door> doors3 = Doors.visit(3);
		assertThat(doors2.size()).isEqualTo(doors3.size());
		for (int index = 0; index < doors2.size(); index++) {
			Door door2Times = doors2.get(index);
			Door door3Times = doors3.get(index);
			assertThat(door2Times.getDoorNum()).isEqualTo(door3Times.getDoorNum());
			if (door2Times.getDoorNum() % 3 == 0) {
				assertThat(door2Times.isOpen()).isEqualTo(!door3Times.isOpen());
			}
		}

	}

}

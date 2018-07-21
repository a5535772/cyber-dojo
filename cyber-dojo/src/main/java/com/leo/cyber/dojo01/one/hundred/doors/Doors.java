package com.leo.cyber.dojo01.one.hundred.doors;

import java.util.ArrayList;
import java.util.List;

public class Doors {
	private static final int MAX = 100;

	public static List<Integer> getSwitchList(int seed) {
		List<Integer> result = new ArrayList<>();
		while (seed <= MAX) {
			result.add(seed++);
		}
		return result;
	}

}

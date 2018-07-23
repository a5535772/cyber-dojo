package com.leo.cyber.dojo01.one.hundred.doors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doors {
	private Doors() {
		throw new IllegalStateException("Utility class");
	}

	private static final int MAX_DOOR_NUM = 100;
	private static final int NUM_ZERO = 0;
	private static final int NUM_ONE = 1;
	public static List<Door> visit(int maxVisitSeed) {
		 Map<Integer,Door> doorMap = constructZeroList();
		if (maxVisitSeed < 1) {
			return new ArrayList<>(doorMap.values());
		}
		for (int currentSeed = 1; currentSeed <= maxVisitSeed; currentSeed++) {
			List<Integer> visitList = getSwitchList(currentSeed);
			for (Integer doorNum : visitList) {
				doorMap.get(doorNum).addVisitTimes();
			}
		}
		return new ArrayList<>(doorMap.values());

	}

	private static Map<Integer,Door> constructZeroList() {
		Map<Integer,Door> visitTimeList = new HashMap<>(MAX_DOOR_NUM);
		for (int doorNum = NUM_ONE; doorNum <=MAX_DOOR_NUM; doorNum++) {
			visitTimeList.put(doorNum, new Door(doorNum,Boolean.FALSE,NUM_ZERO));
		}
		return visitTimeList;
	}

	public static List<Integer> getSwitchList(int seed) {
		int currentDoorNum = seed;
		List<Integer> result = new ArrayList<>();
		while (currentDoorNum <= MAX_DOOR_NUM) {
			result.add(currentDoorNum);
			currentDoorNum += seed;
		}
		return result;
	}

}

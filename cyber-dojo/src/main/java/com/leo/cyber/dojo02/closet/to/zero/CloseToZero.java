package com.leo.cyber.dojo02.closet.to.zero;

public class CloseToZero {

	public int chose(int[] sourceArray) {
		Integer minPositiveNum = null;
		Integer maxNegativeNum = null;
		for (int num : sourceArray) {
			if (num == 0) {
				return 0;
			}
			maxNegativeNum = choseMaxNegativeNum(maxNegativeNum, num);
			minPositiveNum = choseMinPositiveNum(minPositiveNum, num);
		}
		return choseClosest(minPositiveNum, maxNegativeNum);
	}

	private Integer choseMinPositiveNum(Integer minPositiveNum, int num) {
		if (num > 0) {
			if (minPositiveNum == null) {
				minPositiveNum = num;
			} else {
				minPositiveNum = minPositiveNum < num ? minPositiveNum : num;
			}
		}
		return minPositiveNum;
	}

	private Integer choseMaxNegativeNum(Integer maxNegativeNum, int num) {
		if (num < 0) {
			if (maxNegativeNum == null) {
				maxNegativeNum = num;
			} else {
				maxNegativeNum = maxNegativeNum > num ? maxNegativeNum : num;
			}
		}
		return maxNegativeNum;
	}

	private Integer choseClosest(Integer minPositiveNum, Integer maxNegativeNum) {
		if (minPositiveNum == null)
			return maxNegativeNum;
		if (maxNegativeNum == null)
			return minPositiveNum;
		if(Math.abs(maxNegativeNum)<minPositiveNum) {
			return maxNegativeNum;
		}
		return minPositiveNum;
	}

}

package com.leo.cyber.dojo02.closet.to.zero;

public class CloseToZero {

	public int chose(int[] sourceArray) {
		Integer minPositiveNum = choseMinPositiveNum(sourceArray);
		Integer maxNegativeNum = choseMaxNegativeNum(sourceArray);
		return choseClosest(minPositiveNum, maxNegativeNum);
	}

	private Integer choseMinPositiveNum(int[] sourceArray) {
		Integer result = null;
		for (int current : sourceArray) {
			result = choseMinPositiveNum(result, current);
		}
		return result;
	}

	private Integer choseMaxNegativeNum(int[] sourceArray) {
		Integer result = null;
		for (int current : sourceArray) {
			result = choseMaxNegativeNum(result, current);
		}
		return result;
	}

	private Integer choseMinPositiveNum(Integer minPositiveNum, int num) {
		if (num == 0) {
			return 0;
		} else if (num > 0) {
			if (minPositiveNum == null) {
				minPositiveNum = num;
			} else {
				minPositiveNum = minPositiveNum < num ? minPositiveNum : num;
			}
		}
		return minPositiveNum;
	}

	private Integer choseMaxNegativeNum(Integer maxNegativeNum, int num) {
		if (num == 0) {
			return 0;
		} else if (num < 0) {
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
		if (Math.abs(maxNegativeNum) < minPositiveNum) {
			return maxNegativeNum;
		}
		return minPositiveNum;
	}

}

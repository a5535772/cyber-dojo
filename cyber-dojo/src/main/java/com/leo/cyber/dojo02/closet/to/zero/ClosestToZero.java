package com.leo.cyber.dojo02.closet.to.zero;

public class ClosestToZero {

	public int chose(int[] sourceNumbers) {
		Integer minPositiveNum = choseMinPositiveNum(sourceNumbers);
		Integer maxNegativeNum = choseMaxNegativeNum(sourceNumbers);
		return choseClosest(minPositiveNum, maxNegativeNum);
	}

	private Integer choseMinPositiveNum(int[] sourceNumbers) {
		Integer minPositiveNum = null;
		for (int currentNum : sourceNumbers) {
			minPositiveNum = choseMinPositiveNum(minPositiveNum, currentNum);
		}
		return minPositiveNum;
	}

	private Integer choseMaxNegativeNum(int[] sourceNumbers) {
		Integer maxNegativeNum = null;
		for (int currentNum : sourceNumbers) {
			maxNegativeNum = choseMaxNegativeNum(maxNegativeNum, currentNum);
		}
		return maxNegativeNum;
	}

	private Integer choseMinPositiveNum(Integer minPositiveNum, int currentNum) {
		if (currentNum == 0) {
			return 0;
		} else if (currentNum > 0) {
			if (minPositiveNum == null) {
				minPositiveNum = currentNum;
			} else {
				minPositiveNum = minPositiveNum < currentNum ? minPositiveNum : currentNum;
			}
		}
		return minPositiveNum;
	}

	private Integer choseMaxNegativeNum(Integer maxNegativeNum, int currentNum) {
		if (currentNum == 0) {
			return 0;
		} else if (currentNum < 0) {
			if (maxNegativeNum == null) {
				maxNegativeNum = currentNum;
			} else {
				maxNegativeNum = maxNegativeNum > currentNum ? maxNegativeNum : currentNum;
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

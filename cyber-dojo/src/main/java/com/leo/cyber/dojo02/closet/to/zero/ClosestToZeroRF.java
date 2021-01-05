package com.leo.cyber.dojo02.closet.to.zero;

import java.util.Arrays;

public class ClosestToZeroRF {

    public int chose(int[] sourceNumbers) {
        if (sourceNumbers == null || sourceNumbers.length == 0) {
            throw new IllegalArgumentException();
        }

        Arrays.sort(sourceNumbers);

        if (sourceNumbers[sourceNumbers.length - 1] == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int minPositiveNum = Integer.MAX_VALUE;
        int maxNegativeNum = Integer.MIN_VALUE + 1;//

        for (int currentNumber : sourceNumbers) {
            if (currentNumber < 0) {
                maxNegativeNum = Math.max(maxNegativeNum, currentNumber);
            }
            if (currentNumber >= 0) {
                minPositiveNum = Math.min(minPositiveNum, currentNumber);
                break;
            }
        }

        return Math.abs(maxNegativeNum) < minPositiveNum ? maxNegativeNum : minPositiveNum;
    }

}

package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class PowerOfFour {
    //https://leetcode.com/problems/power-of-fou

    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        int countOnes = 0;
        for (int i = 0; i < 32; i++) {
            int bit = num & 1;
            if (i % 2 != 0 && bit == 1) {
                return false;
            } else {
                if (bit == 1 && (i % 2) == 0) {
                    countOnes++;
                    if (countOnes > 1) {
                        return false;
                    }
                }
            }
            num = num >> 1;
        }
        return countOnes == 1;
    }
}

package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class PowerOfTwo {
    //https://leetcode.com/problems/power-of-two

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int countOnes = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            if (bit == 1) {
                countOnes++;
                if (countOnes > 1) {
                    return false;
                }
            }
            n = n >> 1;
        }
        return true;
    }
}

package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class NumberOf1Bits {
    //https://leetcode.com/problems/number-of-1-bits/submissions/

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            if (bit == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

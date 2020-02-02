package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class BitReversal {
    //https://leetcode.com/problems/reverse-bits/

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;

        for (int i = 0; i < 32; i++) {
            answer = answer << 1;
            answer = answer | (n & 1);
            n = n >> 1;
        }

        return answer;
    }
}

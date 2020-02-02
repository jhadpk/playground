package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class MySqrt {
    //https://leetcode.com/problems/sqrtx/

    public int mySqrt(int x) {
        for (int i = 1; i <= x/2; i++) {
            if ((Math.pow(i, 2) < x && Math.pow(i+1, 2) > x) || Math.pow(i, 2) == x) {
                return i;
            }
        }
        return -1;
    }
}

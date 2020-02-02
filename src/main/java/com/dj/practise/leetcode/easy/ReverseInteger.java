package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class ReverseInteger {
    //https://leetcode.com/problems/reverse-integer/

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }

    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long y = 0;
        while (x > 0) {
            y = y * 10 + x % 10;
            if (y > Integer.MAX_VALUE) return 0;
            x = x/10;
        }
        return isNegative ? -1 * (int) y : (int) y;
    }
}

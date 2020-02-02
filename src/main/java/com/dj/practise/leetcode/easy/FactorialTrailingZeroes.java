package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class FactorialTrailingZeroes {
    //https://leetcode.com/problems/factorial-trailing-zeroes/

    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeroes().trailingZeroes(5));
    }

    /***
     * Trailing zeroes are contributed by 5 * 2. No of 2s will always be greater than # of 5s, hence # of 5s decides the trailing zeroes.
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n/5;
            n = n/5;
        }
        return count;
    }
}

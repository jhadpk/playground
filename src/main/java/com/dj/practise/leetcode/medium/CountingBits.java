package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/2/20
 * @project playground
 */
public class CountingBits {
    //https://leetcode.com/problems/counting-bits/


    public static void main(String[] args) {
        System.out.println(new CountingBits().countBits(20));
    }

    public int[] countBits(int num) {
        int[] result = new int[num+1];
        result[0] = 0;
        if (num == 0) return result;
        result[1] = 1;
        if (num == 1) return result;
        int pow = 1;
        for (int i = 2; i <= num; i++) {
            if (powerIncremented(i, pow)) {
                result[i] = 1;
                pow++;
            } else {
                int lastPow = pow - 1;
                result[i] = result[(int) Math.pow(2, lastPow)] + result[i - (int) Math.pow(2, lastPow)];
            }
        }
        return result;
    }

    private boolean powerIncremented(int n, int pow) {
        return getPower(n, pow) > pow;
    }

    private int getPower(int n, int pow) {
        return Math.pow(2, pow) == n ? pow + 1 : pow;
    }
}

package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class ArithmeticSlices {
    //https://leetcode.com/problems/arithmetic-slices/solution/


    public static void main(String[] args) {
        System.out.println(new ArithmeticSlices().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length]; //stores the count of slices for index 1..i

        dp[0] = 0;
        dp[1] = 0;

        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i-1] == A[i-1] - A[i-2]) {
                dp[i] = 1 + dp[i-1];
                sum += dp[i];
            }
        }
        return sum;
    }
}

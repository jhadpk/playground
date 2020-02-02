package com.dj.practise.misc.dp;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class PerfectSquares {
    //https://leetcode.com/problems/perfect-squares/


    public static void main(String[] args) {
        System.out.println(new PerfectSquares().numSquares(13));
    }

    public int numSquares(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                int sum = j * j;
                if (sum > i) {
                    break;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - sum]);
            }
        }
        return dp[n];
    }
}

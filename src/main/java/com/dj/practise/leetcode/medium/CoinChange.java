package com.dj.practise.leetcode.medium;

import java.util.Arrays;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class CoinChange {
    //https://leetcode.com/problems/coin-change/

    public static void main(String[] args) {
        System.out.println(new CoinChange().coinChange(new int[]{2}, 3));
    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        for (int i = 1; i < amount + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i == coin) {
                    dp[i] = 1;
                    break;
                }
                if (i - coin > 0) {
                    if (dp[i - coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
}

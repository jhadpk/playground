package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class MinCostTickets {
    //https://leetcode.com/problems/minimum-cost-for-tickets/

    public static void main(String[] args) {
        System.out.println(new MinCostTickets().mincostTickets(new int[]{1, 2, 3, 4, 6, 8, 9, 10, 13, 14, 16, 17, 19, 21, 24, 26, 27, 28, 29}, new int[]{3, 14, 50}));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int[] pass = new int[]{1, 7, 30};
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];
        int j = 0;
        dp[0] = 0;
        for (int i = 1; i <= lastDay; i++) {
            if (i == days[j]) {
                dp[i] = Integer.MAX_VALUE;
                for (int k = 0; k < 3; k++) {
                    if (i - pass[k] > 0) {
                        dp[i] = Math.min(dp[i], dp[i - pass[k]] + costs[k]);
                    } else {
                        dp[i] = Math.min(dp[i], costs[k]);
                    }
                }
                j++;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[lastDay];
    }
}

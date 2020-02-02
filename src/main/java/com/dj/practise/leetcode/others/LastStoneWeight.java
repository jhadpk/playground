package com.dj.practise.leetcode.others;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class LastStoneWeight {
    //https://leetcode.com/problems/last-stone-weight-ii/

    public static void main(String[] args) {
        System.out.println(new LastStoneWeight().lastStoneWeightII(new int[]{57,32,40,27,35,61}));
    }

    //To find how to split, we will convert this into two arrays, such that the sum of second array is close to sum(stones) / 2
    public int lastStoneWeightII(int[] stones) {
        if (stones.length == 2) return Math.abs(stones[0] - stones[1]);
        int sum = 0;
        for (int n : stones) {
            sum += n;
        }

        int target = sum / 2;

        int[][] dp = new int[stones.length+1][target+1];

        for (int i = 1; i <= stones.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (j < stones[i-1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(stones[i-1] + dp[i - 1][j - stones[i-1]], dp[i - 1][j]);
                }
            }
        }

        return Math.abs(sum - 2*dp[stones.length][target]);
    }
}

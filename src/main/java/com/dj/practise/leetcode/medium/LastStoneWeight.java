package com.dj.practise.leetcode.medium;

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

        //0-1 knapsack
        for (int i = 1; i <= stones.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (j < stones[i-1]) {
                    dp[i][j] = dp[i - 1][j]; //weight of ith (index is i-1) stone is greater than target, so its not chosen
                } else {
                    //max (stone i is chosen, stone i is not chosen)
                    dp[i][j] = Math.max(
                            //adding stone i's weight, check for i-1th stone and remaining target is j - weight of ith stone
                            stones[i-1] + dp[i - 1][j - stones[i-1]],
                            dp[i - 1][j] //ith stone is not chosen
                    );
                }
            }
        }
        return Math.abs(sum - 2*dp[stones.length][target]);
    }
}

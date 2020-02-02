package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 12/25/19
 * @project playground
 */
public class MaxSubarraySum {
    //https://leetcode.com/problems/maximum-subarray/

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int n : dp) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}

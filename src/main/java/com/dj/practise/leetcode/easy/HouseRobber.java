package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 12/30/19
 * @project playground
 */
public class HouseRobber {
    //https://leetcode.com/problems/house-robber/


    public static void main(String[] args) {
        System.out.println(new HouseRobber().rob(new int[]{2,1,1,2}));
    }


    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[nums.length - 1];
    }
}

package com.dj.practise.misc.google;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class LargestContigousSubarray {
    //https://leetcode.com/discuss/interview-question/352459/

    public static void main(String[] args) {
        new LargestContigousSubarray().findLargestContigousSubarray(new int[]{1,4,3,2,5,7,3,2,3,5,6,7,8}, 4);
    }

    public int[] findLargestContigousSubarray(int[] nums, int k) {
        if (nums.length < k) return null;
        if (nums.length == k) return nums;
        int[] result = new int[k];

        int[] dp = new int[nums.length];
        int maxSubarray = -1;
        int startingIndex = -1;
        for (int i = 0; i <= nums.length - 4; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + 4; j++) {
                sb.append(nums[j]);
            }
            dp[i] = Integer.parseInt(sb.toString());
            maxSubarray = Math.max(maxSubarray, dp[i]);
            if (dp[i] == maxSubarray) startingIndex = i;
        }

        int j = 0;
        for (int i = startingIndex; i < startingIndex + 4; i++) {
            result[j] = nums[i];
            j++;
        }
        return result;
    }




}

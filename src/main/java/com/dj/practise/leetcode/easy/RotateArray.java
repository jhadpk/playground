package com.dj.practise.leetcode.easy;

import java.util.Arrays;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class RotateArray {
    //https://leetcode.com/problems/rotate-array/

    public static void main(String[] args) {
        new RotateArray().rotate(new int[]{-1,-100,3,99}, 2);
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverseArr(nums, 0, nums.length - 1);
        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, nums.length - 1);
    }


    private void reverseArr(int[] nums, int start, int end) {
        while (start < end) {
            nums[start] = nums[start] + nums[end];
            nums[end] = nums[start] - nums[end];
            nums[start] = nums[start] - nums[end];
            start++;
            end--;
        }
    }
}

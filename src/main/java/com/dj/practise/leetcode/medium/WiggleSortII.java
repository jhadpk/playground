package com.dj.practise.leetcode.medium;

import java.util.Arrays;

/**
 * @author deepakjha on 1/21/20
 * @project playground
 */
public class WiggleSortII {
    //https://leetcode.com/problems/wiggle-sort-ii

    public static void main(String[] args) {
        new WiggleSortII().wiggleSort(new int[]{5,3,1,2,6,7,8,5,5});
    }

    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];

        int mid = 0;
        if (nums.length % 2 == 0) {
            mid = nums.length / 2;
        } else {
            mid = nums.length / 2 + 1;
        }

        int left = mid - 1;
        int right = nums.length - 1;

        int even = 0;
        while (left >= 0) {
            result[even] = nums[left];
            left--;
            even = even + 2;
        }

        int odd = 1;
        while (right >= mid) {
            result[odd] = nums[right];
            right--;
            odd = odd + 2;
        }
        System.arraycopy(result, 0, nums, 0, result.length);
    }
}

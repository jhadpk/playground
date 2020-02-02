package com.dj.practise.leetcode.easy;

import java.util.Arrays;


/**
 * @author deepakjha on 1/1/20
 * @project playground
 */
public class UnsortedSubarray {
    //https://leetcode.com/problems/shortest-unsorted-continuous-subarray/


    public static void main(String[] args) {
        System.out.println(new UnsortedSubarray().findUnsortedSubarray(new int[]{2,6,4,5,10,12,15}));  //3
        System.out.println(new UnsortedSubarray().findUnsortedSubarray(new int[]{2,6,4,5,10,9,15})); //5
        System.out.println(new UnsortedSubarray().findUnsortedSubarray(new int[]{1,3,2,3,3})); //2
        System.out.println(new UnsortedSubarray().findUnsortedSubarray(new int[]{1,3,2,2,2})); //4
        System.out.println(new UnsortedSubarray().findUnsortedSubarray(new int[]{2,3,3,2,4})); //3

    }

    public int findUnsortedSubarray(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[1] < nums[0] ? 2 : 0;

        int startIndex = -1;
        int endIndex = -1;
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            if (sorted[i] != nums[i]) {
                if (startIndex == -1) {
                    startIndex = i;
                }
                endIndex = i;
            }
        }
        return endIndex == startIndex ? 0 : (endIndex - startIndex) + 1;
    }
}

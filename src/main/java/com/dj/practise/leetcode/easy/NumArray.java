package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class NumArray {
    //https://leetcode.com/problems/range-sum-query-immutable/

    private int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int x = i; x <= j; x++) {
            sum += arr[x];
        }
        return sum;
    }
}

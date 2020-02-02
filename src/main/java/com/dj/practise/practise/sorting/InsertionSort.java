package com.dj.practise.practise.sorting;

import java.util.Arrays;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class InsertionSort {
    //https://www.youtube.com/watch?v=JU767SDMDvA

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,7,3,8,9,5,1};
        new InsertionSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void sort(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

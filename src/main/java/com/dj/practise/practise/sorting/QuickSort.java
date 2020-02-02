package com.dj.practise.practise.sorting;

import java.util.Arrays;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,7,3,8,9,5,2};
        new QuickSort().sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) return;
        int pivot = nums[(left + right) / 2];

        int index = partition(nums, left, right, pivot);

        sort(nums, left, index - 1);
        sort(nums, index, right);
    }

    private int partition(int[] nums, int left, int right, int pivot) {
        while (left <= right) {
            while (nums[left] < pivot) {
                left++;
            }
            while (nums[right] > pivot) {
                right--;
            }
            if (left <= right){
                swap(nums, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

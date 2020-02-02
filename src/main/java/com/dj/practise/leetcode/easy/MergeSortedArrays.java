package com.dj.practise.leetcode.easy;

import java.util.Arrays;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class MergeSortedArrays {

    public static void main(String[] args) {
        new MergeSortedArrays().merge(new int[]{1,2,3, }, 3, new int[]{2,4,5}, 3 );
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}

package com.dj.practise.leetcode.easy;

public class MergeSortedArrays {

    /***
     * Algorithm: Start filling nums1 from the right (largest number first) by using two pointers i and j, starting
     * at the last index of both the arrays. Also track the overall index at work through "index".
     * And keep going right to left.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;

        if (i < 0) {
            for (int k = 0; k < n; k++) {
                nums1[k] = nums2[k];
            }
            return;
        }
        if (j < 0) {return;}

        int index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }

        if (j >= 0) {
            // case when all nums1 digits are placed fine, but there are still places left for num2 digits to come
            while (index >= 0) {
                nums1[index] = nums2[j];
                index--;
                j--;
            }
        }
    }
}

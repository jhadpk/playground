package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class MinSwapsToSortArray {
    //https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/

    public int minSwap(int[] A, int[] B) {
        int[] noSwap = new int[A.length];
        int[] swap = new int[A.length];

        noSwap[0] = 0;
        swap[0] = 1;

        for (int i = 1; i < A.length; i++) {
            noSwap[i] = Integer.MAX_VALUE;
            swap[i] = Integer.MAX_VALUE;

            if (A[i] > A[i-1] && B[i] > B[i-1]) {
                noSwap[i] = noSwap[i-1];
                swap[i] = swap[i-1] + 1;
            }

            if (A[i] > B[i-1] && B[i] > A[i-1]) {
                noSwap[i] = Math.min(noSwap[i], swap[i-1]);
                swap[i] = Math.min(swap[i], noSwap[i-1] + 1);
            }
        }

        return Math.min(noSwap[A.length - 1], swap[A.length - 1]);
    }
}

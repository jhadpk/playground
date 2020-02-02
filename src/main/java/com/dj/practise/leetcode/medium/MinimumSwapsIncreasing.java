package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class MinimumSwapsIncreasing {
    //https://leetcode.com/problems/minimum-swaps-to-make-sequences-increasing/

    public static void main(String[] args) {
        System.out.println(new MinimumSwapsIncreasing().minSwap(new int[]{1,3,5,4}, new int[]{1,2,3,7}));
    }

    public int minSwap(int[] A, int[] B) {
        int swaps = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i] || B[j] > B[i]) {
                    int temp = A[i];
                    A[i] = B[i];
                    B[i] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
}

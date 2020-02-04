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
        int[] noSwap = new int[A.length];
        int[] swap = new int[A.length];

        noSwap[0] = 0;
        swap[0] = 1;

        for (int i = 1; i < A.length; i++) {
            noSwap[i] = Integer.MAX_VALUE;
            swap[i] = Integer.MAX_VALUE;

            if (A[i] > A[i-1] && B[i] > B[i-1]) {
                noSwap[i] = noSwap[i-1]; //since the ith index is in correct order, so noswap[i] will have same value as i-1
                swap[i] = swap[i-1] + 1; //if i-1th index was swapped then we need to swap it back - hence swap[i-1]+1
            }

            //now noswap and swap for ith index would be set if previous condn is satisfied
            if (A[i] > B[i-1] && B[i] > A[i-1]) {
                //we can swap ith index
                noSwap[i] = Math.min(noSwap[i], swap[i-1]); //if i-1th index was swapped it brings array in this form, hence use swap[i-1]
                swap[i] = Math.min(swap[i], noSwap[i-1] + 1); //add 1 to noswap[i-1] as we can swap i
            }
        }

        return Math.min(noSwap[A.length - 1], swap[A.length - 1]);
    }
}

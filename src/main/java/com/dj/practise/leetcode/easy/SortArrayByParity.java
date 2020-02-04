package com.dj.practise.leetcode.easy;

import java.util.Stack;


/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class SortArrayByParity {
    //https://leetcode.com/problems/sort-array-by-parity/


    public static void main(String[] args) {
        new SortArrayByParity().sortArrayByParity(new int[]{648,831,560,986,192,424,997,829,897,843});
    }

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;

        while (i <= j) {
            while (A[i] % 2 == 0) {
                i++;
            }
            while (A[j] % 2 == 1) {
                j--;
            }
            if (i <= j)
                swap(A, i, j);
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

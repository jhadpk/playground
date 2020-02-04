package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class SortByArrayParityII {
    //https://leetcode.com/problems/sort-array-by-parity-ii/submissions/


    public static void main(String[] args) {
        System.out.println(new SortByArrayParityII().sortArrayByParityII(new int[]{648,831,560,986,192,424,997,829,897,843}));
    }

    public int[] sortArrayByParityII(int[] A) {
        int evenSwap = -1;
        int oddSwap = -1;

        for (int i = 0; i < A.length; i++) {
            if ((isEven(i) && isEven(A[i])) || (!isEven(i) && !isEven(A[i]))) {
                continue;
            } else {
                if (isEven(i) && !isEven(A[i])) {
                    if (evenSwap != -1) {
                        swap(A, evenSwap, i);
                        evenSwap = -1;
                    } else {
                        oddSwap = i;
                    }
                } else if (!isEven(i) && isEven(A[i])) {
                    if (oddSwap != -1) {
                        swap(A, oddSwap, i);
                        oddSwap = -1;
                    } else {
                        evenSwap = i;
                    }
                }
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }
}

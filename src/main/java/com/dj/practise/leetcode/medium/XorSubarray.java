package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class XorSubarray {
    //https://leetcode.com/problems/xor-queries-of-a-subarray/

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            xor[i] = xor(arr, query[0], query[1]);
            i++;
        }
        return xor;
    }

    private int xor(int[] arr, int start, int end) {
        int xor = 0;
        for (int i = start; i <= end; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}

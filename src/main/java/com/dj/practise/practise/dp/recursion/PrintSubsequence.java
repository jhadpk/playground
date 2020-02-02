package com.dj.practise.practise.dp.recursion;

import java.util.Arrays;

/**
 * @author deepakjha on 10/12/19
 * @project geeks-for-geeks
 */
public class PrintSubsequence {

    private void printSubsequence(final int[] arr, final int index, final int[] arrResult) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arrResult));
        } else {
            arrResult[index] = 0;
            printSubsequence(arr, index + 1, arrResult);
            arrResult[index] = arr[index];
            printSubsequence(arr, index + 1, arrResult);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arrResult = new int[arr.length];
        new PrintSubsequence().printSubsequence(arr, 0, arrResult);
    }

}

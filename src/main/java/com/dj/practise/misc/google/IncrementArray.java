package com.dj.practise.misc.google;

import java.util.Arrays;

/**
 * @author deepakjha
 * @project playground
 */
public class IncrementArray {
    //Input [1,2,3,4] treat it as 1234 and return [1,2,3,5] i.e 1234+1. Edge case 999

    public static void main(String[] args) {
        final int[] test = new int[4];
        test[0] = 9;
        test[1] = 9;
        test[2] = 9;
        test[3] = 9;
        final int[] result = new IncrementArray().incrementArray(test);
        System.out.println(Arrays.toString(result));
    }

    private int[] incrementArray(final int[] input) {
        int size = input.length;
        int[] result = new int[size];
        int carry = 1;

        for (int i = size - 1; i >= 0; i--) {
            if (input[i] == 9 && carry == 1) {
                result[i] = 0;
                carry = 1;
            } else if (input[i] != 9) {
                result[i] = input[i] + carry;
                carry = 0;
            }
        }

        boolean increaseArraySize = true;
        for (int value : result) {
            if (value != 0) {
                increaseArraySize = false;
                break;
            }
        }

        if (increaseArraySize) {
            result = new int[size + 1];
            result[0] = 1;
            for (int i=1; i< result.length; i++) {
                result[i] = 0;
            }
        }

        return result;
    }

}

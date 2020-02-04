package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Stack;


/**
 * @author deepakjha on 2/3/20
 * @project playground
 */
public class AddToArrayInteger {
    //https://leetcode.com/problems/add-to-array-form-of-integer/


    public static void main(String[] args) {
        System.out.println(new AddToArrayInteger().addToArrayForm(new int[]{1,2,6}, 909));
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int x = K % 10;

            int sum = carry + A[i] + x;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            stack.push(sum);
            K = K / 10;
        }

        if (K > 0) {
            while (K != 0) {
                int x = K % 10;
                int sum = carry + x;
                if (sum > 9) {
                    sum = sum - 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                stack.push(sum);
                K = K / 10;
            }
        }

        if (carry == 1) {
            stack.push(carry);
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}

package com.dj.practise.leetcode.easy;

import java.util.Stack;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class PlusOne {
    //https://leetcode.com/problems/plus-one/

    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{1,2,3});
    }
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            stack.push(sum);
        }
        if (carry == 1){
            stack.push(carry);
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i] = stack.pop();
            i++;
        }
        return res;
    }
}

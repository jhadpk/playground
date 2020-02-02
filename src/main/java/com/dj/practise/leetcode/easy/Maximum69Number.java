package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/28/20
 * @project playground
 */
public class Maximum69Number {
    //https://leetcode.com/problems/maximum-69-number/

    public static void main(String[] args) {
        System.out.println(new Maximum69Number().maximum69Number(6666));
    }


    public int maximum69Number (int num) {
        if (num == 9 || num == 99 || num == 999 || num == 9999) {
            return num;
        }

        int[] digits = new int[4];

        int x = 0;
        while (num > 0) {
            int digit = num % 10;
            digits[x] = digit;
            x++;
            num = num / 10;
        }

        int result = 0;
        boolean done = false;
        for (int i = digits.length - 1; i>= 0; i--) {
            if (digits[i] != 0) {
                if (digits[i] == 6 && !done) {
                    digits[i] = 9;
                    done = true;
                }
                result = result * 10 + digits[i];
            }
        }
        return result;
    }
}

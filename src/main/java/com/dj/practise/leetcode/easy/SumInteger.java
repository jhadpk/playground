package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class SumInteger {
    //https://leetcode.com/problems/sum-of-two-integers/


    public static void main(String[] args) {
        System.out.println(new SumInteger().getSum(-2, 5));
    }
    public int getSum(int a, int b) {
        //https://www.youtube.com/watch?v=qq64FrA2UXQ

        //XOR (^) operator does the actual addition without actually holding the carry
        //& operator helps to find where carry would occur
        //<< operator helps to left shift carry value to one left, since carry gets added to one left bit

        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}

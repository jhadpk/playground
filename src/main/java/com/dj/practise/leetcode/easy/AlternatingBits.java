package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class AlternatingBits {
    //https://leetcode.com/problems/binary-number-with-alternating-bits/

    public static void main(String[] args) {
        System.out.println(new AlternatingBits().hasAlternatingBits(5));
    }


    public boolean hasAlternatingBits(int n) {
        int lastBit = -1;
        int end = (int) (Math.log(n)/ Math.log(2)); //gives log base 2
        for (int i = 0; i <= end; i++) {
            int bit = n & 1;
            if (bit == lastBit) {
                return false;
            }
            n = n >> 1;
            lastBit = bit;
        }
        return true;
    }
}

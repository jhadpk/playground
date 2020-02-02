package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class PowerOfThree {
    //https://leetcode.com/problems/power-of-three/


    public static void main(String[] args) {
        System.out.println(new PowerOfThree().isPowerOfThree(19));
    }

    public boolean isPowerOfThree(int n) {
        return (Math.log10(n)/Math.log10(3)) % 1 == 0;
    }
}

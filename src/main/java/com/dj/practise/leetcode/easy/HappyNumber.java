package com.dj.practise.leetcode.easy;

import java.util.HashSet;
import java.util.Set;


/**
 * @author deepakjha on 1/9/20
 * @project playground
 */
public class HappyNumber {
    //https://leetcode.com/problems/happy-number/


    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(192));
    }

    public boolean isHappy(int n) {
        Set<Integer> alreadyChecked = new HashSet<>();
        alreadyChecked.add(n);
        while (n != 1) {
            n = getDigitSquareSum(n);
            if (n == 1) return true;
            if (alreadyChecked.contains(n)) return false;
            alreadyChecked.add(n);
            if (n == 0) return false;
        }
        return true;
    }

    private int getDigitSquareSum(int n) {
        int digitSquareSum = 0;
        while (n != 0) {
            digitSquareSum += Math.pow(n % 10, 2);
            n = n/10;
        }
        return digitSquareSum;
    }
}

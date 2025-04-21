package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public boolean isPalindrome(int x) {

        List<Integer> digits = new ArrayList<>();

        if (x < 0) return false;

        while (x > 0) {
            int digit = x % 10;
            digits.add(0, digit);
            x = x / 10;
        }


        int i = 0;
        int j = digits.size() - 1;

        while (i <= j) {
            if (digits.get(i) == digits.get(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}

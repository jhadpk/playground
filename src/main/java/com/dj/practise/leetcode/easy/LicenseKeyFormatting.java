package com.dj.practise.leetcode.easy;

import java.util.Stack;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class LicenseKeyFormatting {
    //https://leetcode.com/problems/license-key-formatting/

    public static void main(String[] args) {
        System.out.println(new LicenseKeyFormatting().licenseKeyFormatting("r", 1));
    }

    public String licenseKeyFormatting(String S, int K) {
        String str = S.replaceAll("-", "");
        int len = str.length();
        if (len <= K) return str.toUpperCase();

        String[] chars = str.toUpperCase().split("");
        Stack<String> stack = new Stack();

        int count = 0;
        for (int i = chars.length; i > 0; i--) {
            if (count % K == 0 && count > 0) {
                stack.push("-");
                stack.push(chars[i-1]);
                count = 1;
            } else {
                stack.push(chars[i-1]);
                count++;
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}

package com.dj.practise.leetcode.easy;

import java.util.Stack;


/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class SplitStringToBalancedStrings {
    //https://leetcode.com/problems/split-a-string-in-balanced-strings/


    public static void main(String[] args) {
        System.out.println(new SplitStringToBalancedStrings().balancedStringSplit("R"));
    }

    public int balancedStringSplit(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (Character c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() == c) {
                stack.push(c);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    count++;
                }
            }

        }
        return count;
    }
}

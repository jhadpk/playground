package com.dj.practise.leetcode.easy;

import java.util.Stack;


/**
 * @author deepakjha on 1/1/20
 * @project playground
 */
public class ValidParenthesis {
    //https://leetcode.com/problems/valid-parentheses/

    public static void main(String[] args) {
        System.out.println(new ValidParenthesis().isValid("])"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        if (charArray.length == 1) {
            return false;
        }
        for (Character c : charArray) {
            switch (c) {
                case ')' :
                    if (stack.size() == 0 || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                        continue;
                    }
                case '}' :
                    if (stack.size() == 0 || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                        continue;
                    }
                case ']' :
                    if (stack.size() == 0 || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                        continue;
                    }
                default:
                    stack.push(c);
            }
        }
        return stack.size() == 0;
    }
}

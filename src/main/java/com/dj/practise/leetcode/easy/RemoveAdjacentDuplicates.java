package com.dj.practise.leetcode.easy;

import java.util.Stack;


/**
 * @author deepakjha on 2/3/20
 * @project playground
 */
public class RemoveAdjacentDuplicates {
    //https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/


    public static void main(String[] args) {
        System.out.println(new RemoveAdjacentDuplicates().removeDuplicates("aabbbca"));
    }

    public String removeDuplicates(String S) {
        if (S.length() == 0) return S;
        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        Stack<Character> reverseStack = new Stack<>();

        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        StringBuilder result = new StringBuilder();
        while (!reverseStack.isEmpty()) {
            result.append(reverseStack.pop());
        }
        return result.toString();
    }
}

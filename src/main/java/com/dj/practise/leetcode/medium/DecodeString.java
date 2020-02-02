package com.dj.practise.leetcode.medium;

import java.util.Stack;


/**
 * @author deepakjha on 1/5/20
 * @project playground
 */
public class DecodeString {
    //https://leetcode.com/problems/decode-string/


    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("3[a2[c]]"));
    }

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> result = new Stack<>();
        result.push("");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int index = i;
                while (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                    index++;
                }
                numStack.push(Integer.parseInt(s.substring(i, index)));
                i = index - 1;
            } else if (c == '[') {
                result.push("");
            } else if (c == ']') {
                int times = numStack.pop();
                StringBuilder sb = new StringBuilder();
                String str = result.pop();
                while (times > 0) {
                    sb.append(str);
                    times--;
                }
                result.push(result.pop() + sb.toString());
            } else {
                result.push(result.pop() + c);
            }
        }
        return result.pop();
    }
}

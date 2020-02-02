package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class ReverseString {
    //https://leetcode.com/problems/reverse-string

    public static void main(String[] args) {
        new ReverseString().reverseString(new char[]{'h'});
    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

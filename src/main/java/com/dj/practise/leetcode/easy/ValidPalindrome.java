package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class ValidPalindrome {
    //https://leetcode.com/problems/valid-palindrome/

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if ((c >= 'a' && c <= 'z') || (c >= 48 && c <= 57)) {
                sb.append(c);
            }
        }
        String str = sb.toString();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

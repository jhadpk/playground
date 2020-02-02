package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class ValidAnagram {
    //https://leetcode.com/problems/valid-anagram/


    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("a", "b"));
    }

    public boolean isAnagram(String s, String t) {
        int[] ints = new int[26];
        int[] intt = new int[26];

        char[] sCharArray = s.toCharArray();
        for (char c : sCharArray) {
            ints[c - 'a'] = ints[c - 'a'] + 1;
        }

        char[] tCharArray = t.toCharArray();
        for (char c : tCharArray) {
            intt[c - 'a'] = intt[c - 'a'] + 1;
        }

        int diff = 0;
        for (int i = 0; i < 26; i++) {
            diff += Math.abs(ints[i] - intt[i]);
        }
        return diff == 0;
    }
}

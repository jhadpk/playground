package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class LongestCommonPrefix {
    //https://leetcode.com/problems/longest-common-prefix/

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "", "flowe"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return sb.toString().substring(0, sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}

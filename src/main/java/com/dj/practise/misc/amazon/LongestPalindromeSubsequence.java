package com.dj.practise.misc.amazon;

/**
 * @author deepakjha
 * @project playground
 */
public class LongestPalindromeSubsequence {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSubsequence().longestPalindrome("abcaxyzcbe"));
    }

    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();

        int[][] dp = new int[charArray.length][charArray.length];

        for (int j = 0; j < charArray.length; j++) {
            for (int i = charArray.length - 1; i >= 0; i--) {
                int value;
                if (i == j) {
                    value = 1;
                } else if (i > j) {
                    value = 0;
                } else {
                    if (charArray[i] == charArray[j]) {
                        value = dp[i+1][j-1] + 2;
                    } else {
                        value = Math.max(dp[i][j-1], dp[i+1][j]);
                    }
                }
                dp[i][j] = value;
            }
        }


        int i = 0;
        int j = charArray.length - 1;

        char[] output = new char[charArray.length];
        while (i <= j) {
            if (i == j || charArray[i] == charArray[j]) {
                output[i] = charArray[i];
                output[j] = charArray[j];
                i++;
                j--;
            } else {
                if (dp[i][j-1] > dp[i+1][j]) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return String.valueOf(output).replaceAll("\u0000", "").trim();
    }
}

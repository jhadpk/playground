package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/3/20
 * @project playground
 */
public class PalindromicSubstrings {
    //https://leetcode.com/problems/palindromic-substrings/


    public static void main(String[] args) {
        System.out.println(new PalindromicSubstrings().countSubstrings("aaa"));
    }

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (isPalindrome(s, i, j)) {
                    if (((j + 1) - i) % 2 == 0) {
                        count = count + (((j + 1) - i) / 2);
                    } else {
                        count = count + (((j + 2) - i) / 2);
                    }
                    break;
                }

                //count = isPalindrome(s, i, j) ? count + 1 : count;
            }
        }
        return count;
    }

    private boolean isPalindrome(String s, int startIndex, int endIndex) {
        String str = s.substring(startIndex, endIndex + 1);
        if (str.length() == 1) return true;
        char[] strArr = str.toCharArray();
        int i = 0;
        int j = strArr.length - 1;

        while (i < j) {
            if (strArr[i] != strArr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

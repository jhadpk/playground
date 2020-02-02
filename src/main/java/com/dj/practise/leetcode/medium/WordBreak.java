package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class WordBreak {
    //https://leetcode.com/problems/word-break/

    public static void main(String[] args) {
        System.out.println(new WordBreak().wordBreak("leetcode", new ArrayList<>(Arrays.asList("leet", "code"))));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int l = 1; l <= s.length(); l++) { // length of substring being checked
            for (int i = 0; i <= s.length() - l; i++) { //start index of the substring
                int j = i + l - 1; //last index of substring
                if (wordDict.contains(s.substring(i, j + 1))) {
                    dp[i][j] = true;
                } else {
                    for (int k = i; k <= j; k++) {
                        dp[i][j] = dp[i][k] && dp[k + 1][j];
                        if (dp[i][j]) {
                            break;
                        }
                    }
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}

package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/5/20
 * @project playground
 */
public class UniqueBST {
    //https://leetcode.com/problems/unique-binary-search-trees/


    public static void main(String[] args) {
        System.out.println(new UniqueBST().numTrees(4));
    }

    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //left subtrees count = dp[j-1] , since left subtree value would be atleast 1 less than root val
                //right subtrees count = dp[i-j], since right subtree value would be >j but <1
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}

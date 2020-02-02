package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class HouseRobber {
    //https://leetcode.com/problems/house-robber-iii/


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        System.out.println(new HouseRobber().rob(root));
    }


    public int rob(TreeNode root) {
        if (root == null) { return 0; }
        int[] dp = robHelper(root);
        return Math.max(dp[0], dp[1]);
    }

    private int[] robHelper(TreeNode root) {
        if (root == null) return new int[2];
        int[] dp = new int[2];
        int[] left = robHelper(root.left);
        int[] right = robHelper(root.right);

        dp[0] = root.val + left[1] + right[1];
        dp[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return dp;
    }
}

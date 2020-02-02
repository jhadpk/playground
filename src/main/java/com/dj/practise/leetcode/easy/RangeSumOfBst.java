package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class RangeSumOfBst {
    //https://leetcode.com/problems/range-sum-of-bst/

    public int rangeSumBST(TreeNode root, int L, int R) {
        return helper(root, L, R, 0);
    }

    private int helper(TreeNode root, int L, int R, int sum) {
        if (root == null) return sum;
        if (root.val >= L && root.val <= R) {
            sum += root.val + helper(root.right, L, R, sum) +  helper(root.left, L, R, sum);
        } else if (root.val < L) {
            sum += helper(root.right, L, R, sum);
        } else {
            sum += helper(root.left, L, R, sum);
        }
        return sum;
    }
}

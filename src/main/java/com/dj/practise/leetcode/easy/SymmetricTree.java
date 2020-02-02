package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 12/25/19
 * @project playground
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        if (left.val == right.val) {
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
        return false;
    }



}

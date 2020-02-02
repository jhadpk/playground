package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class UnivaluedTree {
    //https://leetcode.com/problems/univalued-binary-tree/submissions/

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return false;
        int value = root.val;

        return isUnival(root, value);
    }

    private boolean isUnival(TreeNode root, int value) {
        if (root == null) return true;

        if (root.val == value) {
            return isUnival(root.left, value) && isUnival(root.right, value);
        } else {
            return false;
        }
    }
}

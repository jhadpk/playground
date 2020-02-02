package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 12/22/19
 * @project playground
 */
public class MaximumDepthOfBT {
    //https://leetcode.com/problems/maximum-depth-of-binary-tree/

    public int maxDepth(TreeNode root) {
        return doPreOrder(root, 0);
    }

    private int doPreOrder(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        if (root.left == null && root.right == null) {
            return depth + 1;
        }
        depth = depth + 1;
        return Math.max(doPreOrder(root.left, depth), doPreOrder(root.right, depth));
    }
}

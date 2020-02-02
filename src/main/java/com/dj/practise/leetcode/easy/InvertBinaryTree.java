package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 12/22/19
 * @project playground
 */
public class InvertBinaryTree {
    //https://leetcode.com/problems/invert-binary-tree/

    public TreeNode invertTree(TreeNode root) {

        if (root.left != null && root.right != null) {
            TreeNode tempLeft = root.left;
            root.left = root.right;
            root.right = tempLeft;
        } else if (root.left == null) {
            if (root.right != null) {
                root.left = root.right;
                root.right = null;
            }
        } else {
            root.right = root.left;
            root.left = null;
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }


}

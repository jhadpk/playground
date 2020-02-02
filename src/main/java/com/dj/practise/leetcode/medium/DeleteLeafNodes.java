package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.Stack;

/**
 * @author deepakjha on 1/31/20
 * @project playground
 */
public class DeleteLeafNodes {
    //https://leetcode.com/problems/delete-leaves-with-a-given-value/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(5);

        new DeleteLeafNodes().removeLeafNodes(root, 2);
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;
        if (root.left == null && root.right == null && root.val == target) return null;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null && root.val == target) return null;

        return root;
    }

}

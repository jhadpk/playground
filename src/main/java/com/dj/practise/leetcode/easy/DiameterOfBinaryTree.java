package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 12/24/19
 * @project playground
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);

        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(t1));
    }

    /*
    Intuition :
    1. Find height of left subtree and right subtree - sum them.
    2. Find diameter of left subtree.
    3. Find diameter of right subtree.
    Find max of 1,2,3
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        int lDiameter = diameterOfBinaryTree(root.left);
        int rDiameter = diameterOfBinaryTree(root.right);

        return Math.max(lHeight + rHeight + 1, Math.max(lDiameter, rDiameter));
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (1 + Math.max(height(root.left), height(root.right)));
    }

}

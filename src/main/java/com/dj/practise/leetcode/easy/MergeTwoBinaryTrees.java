package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 12/22/19
 * @project playground
 */
public class MergeTwoBinaryTrees {

    //https://leetcode.com/problems/merge-two-binary-trees/

    //public static void main(String[] args) {
    //    TreeNode t1 = new TreeNode(1);
    //    t1.left = new TreeNode(3);
    //    t1.right = new TreeNode(2);
    //    t1.left.left = new TreeNode(5);
    //
    //    TreeNode t2 = new TreeNode(2);
    //    t2.left = new TreeNode(1);
    //    t2.right = new TreeNode(3);
    //    t2.left.right = new TreeNode(4);
    //    t2.right.right = new TreeNode(7);
    //
    //    new MergeTwoBinaryTrees().mergeTrees(t1, t2);
    //    System.out.println(t1);
    //}

    private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}

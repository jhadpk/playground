package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 2/1/20
 * @project playground
 */
public class SumEvenVauedGrandParent {
    //https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.left.left.left = new TreeNode(9);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(5);

        System.out.println(new SumEvenVauedGrandParent().sumEvenGrandparent(root));
    }

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return sumEvenGrandParentValue(root, 0);
    }

    private int sumEvenGrandParentValue(TreeNode root, int sum) {
        if (root == null) return sum;

        int grandChildSum = 0;
        if (root.val % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null) {
                    grandChildSum += root.left.left.val;
                }
                if (root.left.right != null) {
                    grandChildSum += root.left.right.val;
                }
            }
            if (root.right != null) {
                if (root.right.left != null) {
                    grandChildSum += root.right.left.val;
                }
                if (root.right.right != null) {
                    grandChildSum += root.right.right.val;
                }
            }
        }

        sum += grandChildSum + sumEvenGrandParentValue(root.left, sum) + sumEvenGrandParentValue(root.right, sum);
        return sum;
    }
}

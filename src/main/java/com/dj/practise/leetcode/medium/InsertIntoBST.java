package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class InsertIntoBST {
    //https://leetcode.com/problems/insert-into-a-binary-search-tree/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(new InsertIntoBST().insertIntoBST(root, 5));
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        insert(root, val);
        return root;
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root.val > val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return root;
            } else {
                insert(root.left, val);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return root;
            } else {
                insert(root.right, val);
            }
        }
        return root;
    }
}

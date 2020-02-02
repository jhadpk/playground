package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class BstFromPreorder {
    //https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

    public static void main(String[] args) {
        System.out.println(new BstFromPreorder().bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12}));
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int i = 0; i < preorder.length; i++) {
            if (i == 0) {
                root = new TreeNode(preorder[0]);
            } else {
                insertIntoBst(root, preorder[i]);
            }
        }
        return root;
    }

    private void insertIntoBst(TreeNode root, int value) {
        if (root.val > value) {
            if (root.left == null) {
                root.left = new TreeNode(value);
                return;
            }
            insertIntoBst(root.left, value);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
                return;
            }
            insertIntoBst(root.right, value);
        }
    }

}

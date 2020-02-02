package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class ConstructBinaryTreeFromInorderPreorder {
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

    public static void main(String[] args) {
        new ConstructBinaryTreeFromInorderPreorder().buildTree(new int[]{1,2,3}, new int[]{2,3,1});
    }

    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length - 1;
        return build(preorder, inorder, 0, len);
    }

    private TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;

        TreeNode node = new TreeNode(preorder[preIndex++]);
        if (start == end) {
            return node;
        }

        int inindex = findIndexInInOrder(inorder, start, end, node.val);

        node.left = build(preorder, inorder, start, inindex - 1);
        node.right = build(preorder, inorder, inindex + 1, end);
        return node;
    }

    private int findIndexInInOrder(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return end;
    }
}

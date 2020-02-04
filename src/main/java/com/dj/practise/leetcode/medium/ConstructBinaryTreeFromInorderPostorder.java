package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class ConstructBinaryTreeFromInorderPostorder {

    public static void main(String[] args) {
        new ConstructBinaryTreeFromInorderPostorder().buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});
    }

    int postIndex = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length - 1;
        postIndex = postorder.length - 1;
        return build(inorder, postorder, 0, len);
    }

    private TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        if (start > end) return null;
        TreeNode node = new TreeNode(postorder[postIndex--]);

        int index = findIndexInInorder(inorder, start, end, node.val);

        node.right = build(inorder, postorder, index+1, end);
        node.left = build(inorder, postorder, start, index -1);
        return node;
    }

    private int findIndexInInorder(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return end;
    }

}

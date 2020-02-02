package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class MaximumBinaryTree {
    //https://leetcode.com/problems/maximum-binary-tree/

    public static void main(String[] args) {
        System.out.println(new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3,2,1,6,0,5}));
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recursiveConstruct(nums, 0, nums.length - 1);
    }

    private TreeNode recursiveConstruct(int[] nums, int start, int end) {
        if (start > end) return null;
        if (start == end) return new TreeNode(nums[start]);
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = recursiveConstruct(nums, start, maxIndex -1);
        node.right = recursiveConstruct(nums, maxIndex + 1, end);
        return node;
    }
}

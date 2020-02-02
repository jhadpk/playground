package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;


/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class SortedArrayToBST {
    //https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/


    public static void main(String[] args) {
        System.out.println(new SortedArrayToBST().sortedArrayToBST(new int[] {-1,0,1,2}));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return bstBuilder(nums,0, nums.length - 1);
    }

    private TreeNode bstBuilder(int[] nums, int start, int end) {
        if (start == end) return new TreeNode(nums[start]);
        if (start > end) return null;
        if (end - start == 1) {
            TreeNode node = new TreeNode(nums[end]);
            node.left = new TreeNode(nums[start]);
            return node;
        }
        int pivot = (start + end) / 2;
        TreeNode node = new TreeNode(nums[pivot]);
        node.left = bstBuilder(nums, start, pivot - 1);
        node.right = bstBuilder(nums,pivot + 1, end);
        return node;
    }
}

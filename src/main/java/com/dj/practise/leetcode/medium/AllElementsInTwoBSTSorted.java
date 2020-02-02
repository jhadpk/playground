package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class AllElementsInTwoBSTSorted {
    //https://leetcode.com/problems/all-elements-in-two-binary-search-trees/

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(5);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(6);
        new AllElementsInTwoBSTSorted().getAllElements(root1, root2);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        inorder(root1, pQueue);
        inorder(root2, pQueue);

        while (!pQueue.isEmpty()) {
            result.add(pQueue.poll());
        }
        return result;
    }

    private void inorder(TreeNode root, PriorityQueue<Integer> priorityQueue) {
        if (root == null) return;
        inorder(root.left, priorityQueue);
        priorityQueue.add(root.val);
        inorder(root.right, priorityQueue);
    }

}

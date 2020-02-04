package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;


/**
 * @author deepakjha on 1/7/20
 * @project inmobi-rtb-validator
 */
public class KthSmallestBST {
    //https://leetcode.com/problems/kth-smallest-element-in-a-bst/


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        new KthSmallestBST().kthSmallest(root, 3);
    }


    public int kthSmallest(TreeNode root, int k) {
        //maxHeap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        findKthSmallest(root, k, priorityQueue, new HashSet<>());
        return priorityQueue.peek() != null ? priorityQueue.peek() : -1;
    }


    private void findKthSmallest(TreeNode root, int k, PriorityQueue<Integer> priorityQueue, Set<Integer> visited) {
        if (root == null) { return; }
        if (!visited.contains(root.val)) {
            priorityQueue.add(root.val);
        }
        if (priorityQueue.size() == k + 1) {
            priorityQueue.poll();
        }
        findKthSmallest(root.left, k, priorityQueue, visited);
        findKthSmallest(root.right, k, priorityQueue, visited);
    }
}

package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class BstToGst {
    //https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        new BstToGst().bstToGst(root);
    }

    public TreeNode bstToGst(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        PriorityQueue<TreeNode> pQueue = new PriorityQueue<>((o1, o2) -> o2.val - o1.val);
        traverse(root, pQueue);
        int sum = 0;
        while (!pQueue.isEmpty()) {
            sum += pQueue.peek().val;
            map.put(pQueue.poll(), sum);
        }
        updateBst(root, map);
        return root;
    }

    private void traverse(TreeNode root, PriorityQueue<TreeNode> priorityQueue) {
        if (root == null) return;
        traverse(root.left, priorityQueue);
        priorityQueue.add(root);
        traverse(root.right, priorityQueue);
    }

    private void updateBst(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return;
        updateBst(root.left, map);
        root.val = map.get(root);
        updateBst(root.right, map);
    }

}

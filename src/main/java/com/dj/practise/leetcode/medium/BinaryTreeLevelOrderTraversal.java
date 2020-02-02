package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class BinaryTreeLevelOrderTraversal {
    //https://leetcode.com/problems/binary-tree-level-order-traversal/


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        new BinaryTreeLevelOrderTraversal().levelOrder(root);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<Integer> levelValues = new ArrayList<>();
        List<TreeNode> nextLevelNodes = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            levelValues.add(node.val);
            if (node.left != null) {
                nextLevelNodes.add(node.left);
            }
            if (node.right != null) {
                nextLevelNodes.add(node.right);
            }
            queue.poll();
            if (queue.isEmpty() && !levelValues.isEmpty()) {
                result.add(levelValues);
                queue.addAll(nextLevelNodes);
                nextLevelNodes = new ArrayList<>();
                levelValues = new ArrayList<>();
            }
        }
        return result;
    }
}

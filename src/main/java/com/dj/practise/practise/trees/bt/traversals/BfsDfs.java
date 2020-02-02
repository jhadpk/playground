package com.dj.practise.practise.trees.bt.traversals;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * @author deepakjha on 12/19/19
 * @project playground
 */
public class BfsDfs {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        //new BfsDfs().printBfsOrLevelOrderTraversal(root);
        new BfsDfs().printDfsOrLevelOrderTraversal(root);

    }
    

    //BFS TRAVERSAL
    private void printBfsOrLevelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode frontNode = queue.peek();
            System.out.println(frontNode.val);
            queue.poll();
            if (frontNode.left != null) {
                queue.offer(frontNode.left);
            }
            if (frontNode.right != null) {
                queue.offer(frontNode.right);
            }
        }
    }

    //DFS TRAVERSAL
    private void printDfsOrLevelOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode topNode = stack.peek();
            System.out.println(topNode.val);
            stack.pop();
            if (topNode.right != null) {
                stack.push(topNode.right);
            }
            if (topNode.left != null) {
                stack.push(topNode.left);
            }
        }
    }
}

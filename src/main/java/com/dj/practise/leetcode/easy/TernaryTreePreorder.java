package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class TernaryTreePreorder {
    //https://leetcode.com/problems/n-ary-tree-preorder-traversal/

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        Stack<Node> dfs = new Stack<>();
        dfs.add(root);
        while (!dfs.isEmpty()) {
            Node node = dfs.peek();
            preorder.add(node.val);
            dfs.pop();
            for (int i = node.children.size() - 1; i >= 0 ; i--) {
                dfs.add(node.children.get(i));
            }
        }
        return preorder;
    }
}

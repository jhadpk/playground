package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.Node;

import java.util.*;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class TernaryTreePostorder {

    public static void main(String[] args) {
        Node child1 = new Node(5);
        Node child2 = new Node(6);
        List<Node> children1 = new ArrayList<>(Arrays.asList(child1, child2));

        Node child1a = new Node(2);
        Node child2a = new Node(4);
        Node child3a = new Node(3, children1);

        List<Node> children2 = new ArrayList<>(Arrays.asList(child3a, child2a, child1a));
        Node root = new Node(1, children2);
        System.out.println(new TernaryTreePostorder().postorder(root));
    }

    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        Set<Node> traversed = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        Node lastPeeked = null;
        while (!stack.isEmpty()) {
            Node node = stack.peek();
            if (!traversed.contains(node)) {
                traversed.add(node);
                if (node.children != null) {
                    List<Node> children = node.children;
                    for (int i = children.size() - 1; i >= 0; i--) {
                        stack.add(children.get(i));
                    }
                }
            }
            if (lastPeeked == stack.peek()) {
                postorder.add(stack.pop().val);
            }
            if (stack.isEmpty()) {
                return postorder;
            }
            lastPeeked = stack.peek();
        }
        return postorder;
    }
}

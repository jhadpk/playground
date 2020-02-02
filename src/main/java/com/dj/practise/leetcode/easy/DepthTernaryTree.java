package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class DepthTernaryTree {
    //https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

    public static void main(String[] args) {
        Node child1 = new Node(5);
        Node child2 = new Node(6);
        List<Node> children1 = new ArrayList<>(Arrays.asList(child1, child2));

        Node child1a = new Node(2);
        Node child2a = new Node(4);
        Node child3a = new Node(3, children1);

        List<Node> children2 = new ArrayList<>(Arrays.asList(child3a, child2a, child1a));
        Node root = new Node(1, children2);
        System.out.println(new DepthTernaryTree().maxDepth(root));
    }


    public int maxDepth(Node root) {
        if (root == null) return 0;
        return findDepth(root, 1);
    }

    private int findDepth(Node root, int depth) {
        if (root == null) return 0;

        List<Node> children = root.children;
        int nextDepth = depth + 1;
        if (children != null) {
            for (Node child : children) {
                depth = Math.max(depth, findDepth(child, nextDepth));
            }
        }
        return depth;
    }
}

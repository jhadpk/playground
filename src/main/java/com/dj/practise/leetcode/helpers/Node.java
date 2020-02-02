package com.dj.practise.leetcode.helpers;

import java.util.List;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class Node {
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

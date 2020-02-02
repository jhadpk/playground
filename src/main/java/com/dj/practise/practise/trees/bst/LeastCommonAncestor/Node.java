package com.dj.practise.practise.trees.bst.LeastCommonAncestor;

import lombok.Data;

@Data
public class Node {
    Node left, right;
    int data;

    Node (int data) {
        this.data = data;
        left = right = null;
    }
}

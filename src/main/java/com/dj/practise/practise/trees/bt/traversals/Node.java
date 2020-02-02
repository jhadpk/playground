package com.dj.practise.practise.trees.bt.traversals;

import lombok.Data;

/**
 * @author deepakjha on 10/12/19
 * @project geeks-for-geeks
 */
@Data
public class Node {
    Node left, right;
    int data;

    Node (int data) {
        this.data = data;
        left = right = null;
    }
}

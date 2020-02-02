package com.dj.practise.practise.trees.bst;

public class Tree {
    private Tree left, right;
    private int data;

    public Tree(int value) {
        this.data = value;
    }

    public void insert(final int value) {
        if (value < data) {
            if (left == null) {
                left = new Tree(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Tree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(final int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}

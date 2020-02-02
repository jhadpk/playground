package com.dj.practise.misc.trees.bst;

public class MainClass {
    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.insert(5);
        tree.insert(4);
        tree.insert(16);
        tree.insert(12);
        tree.insert(18);
        tree.insert(15);
        tree.insert(6);
        tree.insert(8);
        tree.insert(3);
        tree.insert(7);
        System.out.println(tree.contains(11));
        System.out.println(tree.contains(15));
        tree.printInOrder();
    }
}

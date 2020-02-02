package com.dj.practise.practise.trees.bst.LeastCommonAncestor;

public class BinarySearchTree {

    Node root;

    public Node findLeastCommonAncestor(Node node, int n1, int n2) {
        if (node == null)
            return null;
        if (node.data > n1 && node.data > n2)
            return findLeastCommonAncestor(node.left, n1, n2);
        if (node.data < n1 && node.data < n2)
            return findLeastCommonAncestor(node.right, n1, n2);
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(10);
        bst.root.left = new Node(5);
        bst.root.right = new Node(15);
        bst.root.left.left = new Node(3);
        bst.root.left.right = new Node(8);
        bst.root.right.left = new Node(12);
        bst.root.right.left = new Node(18);

        System.out.println(bst.findLeastCommonAncestor(bst.root, 12, 18).getData());
    }
}

package com.dj.practise.misc.trees.bt.traversals;

/**
 * @author deepakjha on 10/12/19
 * @project geeks-for-geeks
 */
public class BinaryTreeTraversals {
    //Using recursion
    Node root;

    public static void main(String[] args) {
        BinaryTreeTraversals binaryTree = new BinaryTreeTraversals();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.left.left = new Node(3);
        binaryTree.root.left.left.left = new Node(4);
        binaryTree.root.left.left.left.left = new Node(5);
//        binaryTree.root.right = new Node(3);
//        binaryTree.root.left.left = new Node(4);
//        binaryTree.root.left.right = new Node(5);

        binaryTree.printInorder(binaryTree.root);
        System.out.println();
        binaryTree.printPreOrder(binaryTree.root);
        System.out.println();
        binaryTree.printPostOrder(binaryTree.root);
    }

    private void printInorder(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data);
            return;
        }
        printInorder(root.left);
        System.out.print(root.data);
        printInorder(root.right);
    }

    private void printPreOrder(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data);
            return;
        }
        System.out.print(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private void printPostOrder(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data);
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data);
    }
}

package com.dj.practise.practise.trees.bt.CheckBst;

/**
 * @author deepakjha on 10/11/19
 * @project geeks-for-geeks
 */
public class CheckBst {

    private boolean isBst(Node node) {
        if (node.left == null || node.right == null) {
            return true;
        }

        if (node.value < node.left.value || node.value > node.right.value) {
            return false;
        }

        boolean leftIsBst = isBst(node.left);

        boolean rightIsBst = isBst(node.right);

        return leftIsBst && rightIsBst;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(5);
        node.left.left = new Node(3);
        node.left.left.left = new Node(2);
        node.left.left.right = new Node(4);
        node.left.right = new Node(7);
        node.left.right.left = new Node(6);
        node.left.right.right = new Node(8);
        node.right = new Node(15);
        node.right.left = new Node(12);
        node.right.right = new Node(17);

        System.out.println(new CheckBst().isBst(node));
    }

}

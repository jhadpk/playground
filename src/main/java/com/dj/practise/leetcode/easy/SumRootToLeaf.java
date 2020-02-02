package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deepakjha on 2/1/20
 * @project playground
 */
public class SumRootToLeaf {
    //https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(new SumRootToLeaf().sumRootToLeaf(root));
    }

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeafHelper(root, 0);
    }

    private int sumRootToLeafHelper(TreeNode root, int path) {
        if (root == null) return 0;

        int value = path << 1 | root.val;

        if (root.left == null && root.right == null) return value;

        return sumRootToLeafHelper(root.left, value) + sumRootToLeafHelper(root.right, value);
    }

//    public int sumRootToLeaf(TreeNode root) {
//        List<String> paths = new ArrayList<>();
//
//        getPaths(root, "", paths);
//
//        int sum = 0;
//        for (String path : paths) {
//            sum += getDecimal(path);
//        }
//        return sum;
//    }
//
//    private void getPaths(TreeNode node, String path, List<String> paths) {
//        if (node == null) return;
//        if (node.left == null && node.right == null) {
//            path += node.val;
//            paths.add(path);
//            return;
//        }
//        path += node.val;
//
//        getPaths(node.left, path, paths);
//        getPaths(node.right, path, paths);
//    }
//
//
//
//    private int getDecimal(String binary) {
//        String[] chars = binary.split("");
//
//        int num = 0;
//        int index = chars.length - 1;
//        for (String ch : chars) {
//            num += Integer.parseInt(ch) * Math.pow(2, index);
//            index--;
//        }
//        return num;
//    }
}

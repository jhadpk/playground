package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.*;

/**
 * @author deepakjha on 2/1/20
 * @project playground
 */
public class DeepestLeavesSum {
    //https://leetcode.com/problems/deepest-leaves-sum/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);

        new DeepestLeavesSum().deepestLeavesSum(root);
    }

    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> map = new TreeMap<>((o1, o2) -> o2 - o1);

        setDepthMap(root, map, 0);

        return map.entrySet().iterator().next().getValue();
    }

    private void setDepthMap(TreeNode root, Map<Integer, Integer> map, int depth) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            map.put(depth, map.getOrDefault(depth, 0) + root.val);
        }

        setDepthMap(root.left, map, depth + 1);
        setDepthMap(root.right, map, depth + 1);
    }
}

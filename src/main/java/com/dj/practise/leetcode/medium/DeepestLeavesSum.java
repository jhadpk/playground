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
        Map<Integer, List<TreeNode>> map = new HashMap<>();

        setDepthMap(root, map, 0);


        Comparator<Map.Entry<Integer, List<TreeNode>>> comparator = (o1, o2) -> o2.getKey() - o1.getKey();
        List<Map.Entry<Integer, List<TreeNode>>> sorted = new ArrayList<>(map.entrySet());
        sorted.sort(comparator);

        List<TreeNode> deepestNodes = sorted.get(0).getValue();
        int sum = 0;
        for (TreeNode node : deepestNodes) {
            sum += node.val;
        }
        return sum;
    }

    private void setDepthMap(TreeNode root, Map<Integer, List<TreeNode>> map, int depth) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            List<TreeNode> value = map.containsKey(depth) ? map.get(depth) : new ArrayList<>();
            value.add(root);
            map.put(depth, value);
        }

        setDepthMap(root.left, map, depth + 1);
        setDepthMap(root.right, map, depth + 1);
    }
}

package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.*;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class MaxLevelSumBinaryTree {

    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        findLevelSum(root, 1, map);

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        };
        sortedList.sort(comparator);
        return sortedList.get(0).getKey();
    }

    private void findLevelSum(TreeNode root, int level, Map<Integer,Integer> map) {
        if (root == null) return;

        map.put(level, map.containsKey(level) ? map.get(level) + root.val : root.val);

        findLevelSum(root.left, level+1, map);
        findLevelSum(root.right, level+1, map);
    }
}

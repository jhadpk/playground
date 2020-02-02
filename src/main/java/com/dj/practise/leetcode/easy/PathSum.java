package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


/**
 * @author deepakjha on 12/29/19
 * @project playground
 */
public class PathSum {
    //https://leetcode.com/problems/path-sum-iii/


    public static void main(String[] args) {
        //TreeNode root = new TreeNode(10);
        //root.left = new TreeNode(5);
        //root.right = new TreeNode(-3);
        //root.left.left = new TreeNode(3);
        //root.left.right = new TreeNode(2);
        //root.right.right = new TreeNode(11);
        //root.left.left.left = new TreeNode(3);
        //root.left.left.right = new TreeNode(-2);
        //root.left.right.right = new TreeNode(1);


        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        //TreeNode root = new TreeNode(1);
        //root.left = new TreeNode(-2);
        //root.right = new TreeNode(-3);
        //root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        //root.right.left = new TreeNode(-2);
        //root.left.left.left = new TreeNode(-1);

        //TreeNode root = new TreeNode(-2);
        //root.right = new TreeNode(-3);

        System.out.println(new PathSum().pathSum(root, 22));
    }


    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum ? 1 : 0;
        }
        HashMap<TreeNode, Integer> countMap = new LinkedHashMap<>();
        bfs(root, countMap);

        int result = 0;
        for (Map.Entry<TreeNode, Integer> entry : countMap.entrySet()) {
            entry.setValue(pathSumRecursive(entry.getKey(), sum, 0));
        }
        for (Map.Entry<TreeNode, Integer> entry : countMap.entrySet()) {
            result += entry.getValue();
        }
        return result;
    }


    private void bfs(TreeNode root, HashMap<TreeNode, Integer> map) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            map.put(node, 0);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            queue.poll();
        }
    }


    private int pathSumRecursive(TreeNode root, int sum, int count) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val == sum ? count + 1 : 0;
        }
        int leftCount = pathSumRecursive(root.left,sum - root.val, count);
        int rightCount = pathSumRecursive(root.right, sum - root.val, count);
        if (root.val == sum) {
            count = count + 1;
        }
        return count + leftCount + rightCount;
    }

}

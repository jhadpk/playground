package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.TreeNode;

/**
 * @author deepakjha on 1/14/20
 * @project playground
 */
public class SearchInBst {

//    https://leetcode.com/problems/search-in-a-binary-search-tree

    public TreeNode searchBST(TreeNode root, int val) {
        return find(root, val);
    }

    private TreeNode find(TreeNode root, int val) {
        if (root.val > val) {
            if (root.left != null) {
                return find(root.left, val);
            } else {
                return null;
            }
        } else if (root.val < val) {
            if (root.right != null) {
                return find(root.right, val);
            } else {
                return null;
            }
        } else{
            return root;
        }
    }
}

package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 1/3/20
 * @project playground
 */
public class Subsets {
    //https://leetcode.com/problems/subsets/


    public static void main(String[] args) {
        new Subsets().subsets(new int[] {1,2,3});
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i+1, current, subsets);
            current.remove(current.size() - 1);
        }
    }

}

package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deepakjha on 12/17/19
 * @project geeks-for-geeks
 */
public class Permutations {
    //https://leetcode.com/problems/permutations/

    public static void main(String[] args) {
        Permutations p = new Permutations();
        int[] nums = {1, 2, 3};
        System.out.println(p.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        permuteHelper(nums, new ArrayList<>(), solution);
        return solution;
    }

    private void permuteHelper(int[] nums, List<Integer> arr, List<List<Integer>> solution) {
        if (arr.size() == nums.length) {
            solution.add(new ArrayList<>(arr));
        }
        for (int num : nums) {
            if (!arr.contains(num)) {
                arr.add(num);
                permuteHelper(nums, arr, solution);
                arr.remove(arr.size() - 1);
            }
        }
    }
}
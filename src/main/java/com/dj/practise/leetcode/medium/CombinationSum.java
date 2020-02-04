package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class CombinationSum {
    //https://leetcode.com/problems/combination-sum/


    public static void main(String[] args) {
        new CombinationSum().combinationSum(new int[] {2,3,6,7}, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        getCombinations(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void getCombinations(int[] candidates, int index, int target, List<Integer> list, List<List<Integer>> result) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            getCombinations(candidates, i, target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}

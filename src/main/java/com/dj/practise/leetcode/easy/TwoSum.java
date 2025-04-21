package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * https://leetcode.com/problems/two-sum/
 */
class TwoSum {

    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[] {3,2,4}, 6));
    }


    /***
     * Algorithm: Use Hashmaps.
     * keysToRemaining -> captures the array[i] as key, and target - array[i] as value
     * keysToIndex -> to capture array[i] as key, and i as value. Value is list, to honor repetition of values in array
     * Once iterate through array to fill these maps, and then use keysToRemaining to find remaining value's index in keysToIndex
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> keysToRemaining = new HashMap<>();
        Map<Integer, List<Integer>> keysToIndex = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            keysToRemaining.put(nums[i], target - nums[i]);

            List<Integer> values = new ArrayList<>();
            if (keysToIndex.containsKey(nums[i])) {
                values = keysToIndex.get(nums[i]);
            }
            values.add(i);
            keysToIndex.put(nums[i], values);
        }

        for (Map.Entry<Integer, Integer> entry: keysToRemaining.entrySet()) {
            int key = entry.getKey();
            int remaining = entry.getValue();

            if (key == remaining) {
                if (keysToIndex.containsKey(remaining)) {
                    result[0] = keysToIndex.get(key).get(0);
                    result[1] = keysToIndex.get(key).get(1);
                    return result;
                }
            } else {
                if (keysToIndex.containsKey(remaining)) {
                    result[0] = keysToIndex.get(key).get(0);
                    result[1] = keysToIndex.get(remaining).get(0);
                    return result;
                }
            }
        }

        return result;
    }
}
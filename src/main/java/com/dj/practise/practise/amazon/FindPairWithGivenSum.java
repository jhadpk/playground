package com.dj.practise.practise.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * @author deepakjha
 * @project playground
 */
public class FindPairWithGivenSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(new FindPairWithGivenSum().twoSum(nums, 90)[0]);
    }

    public int[] twoSum(int[] nums, int target) {
        int actualTarget = target - 30;

        HashMap<Integer, List<Integer>> valueIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> value = valueIndexMap.get(nums[i]) != null ? valueIndexMap.get(nums[i]) : new ArrayList<>();
            value.add(i);
            valueIndexMap.put(nums[i], value);
        }

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] == actualTarget) {
                if (nums[i] == nums[j]) {
                    //selecting different indices
                    return new int[] {
                            valueIndexMap.get(nums[i]).get(0),
                            valueIndexMap.get(nums[j]).get(1)
                    };
                } else {
                    return new int[] {
                            valueIndexMap.get(nums[i]).get(0),
                            valueIndexMap.get(nums[j]).get(0)
                    };
                }
            } else if (nums[i] + nums[j] < actualTarget) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

}
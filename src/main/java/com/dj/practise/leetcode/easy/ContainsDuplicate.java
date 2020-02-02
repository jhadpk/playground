package com.dj.practise.leetcode.easy;

import java.util.Arrays;


/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class ContainsDuplicate {
    //https://leetcode.com/problems/contains-duplicate/

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}

package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/9/20
 * @project inmobi-rtb-validator
 */
public class MissingNumber {
    //https://leetcode.com/problems/missing-number/

    //public int missingNumber(int[] nums) {
    //    Set<Integer> set = new HashSet<>();
    //    for (int n : nums) {
    //        set.add(n);
    //    }
    //    for (int i = 0; i <= nums.length + 1; i++) {
    //        if (!set.contains(i)) return i;
    //    }
    //    return 0;
    //}

    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}

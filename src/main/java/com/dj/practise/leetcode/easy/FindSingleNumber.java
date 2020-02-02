package com.dj.practise.leetcode.easy;

import java.util.HashMap;


/**
 * @author deepakjha on 12/22/19
 * @project playground
 */
public class FindSingleNumber {
    //https://leetcode.com/problems/single-number/


    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.remove(num);
            } else {
                count.put(num, num);
            }
        }
        return count.entrySet().iterator().next().getKey();
    }
}

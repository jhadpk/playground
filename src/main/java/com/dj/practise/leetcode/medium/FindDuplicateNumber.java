package com.dj.practise.leetcode.medium;

import java.util.HashSet;
import java.util.Set;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class FindDuplicateNumber {
    //https://leetcode.com/problems/find-the-duplicate-number/


    public static void main(String[] args) {
        System.out.println(new FindDuplicateNumber().findDuplicate(new int[]{2,2,2,2,2}));
    }

    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }
}

package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class IntersectionArray {
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/


    public static void main(String[] args) {
        new IntersectionArray().intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] output = new int[res.size()];
        for (int x = 0; x < res.size(); x++) {
            output[x] = res.get(x);
        }
        return output;
    }
}

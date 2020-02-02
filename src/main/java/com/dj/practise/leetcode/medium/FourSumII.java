package com.dj.practise.leetcode.medium;

import java.util.HashMap;
import java.util.Map;


/**
 * @author deepakjha on 1/7/20
 * @project inmobi-rtb-validator
 */
public class FourSumII {
    //https://leetcode.com/problems/4sum-ii/

    public static void main(String[] args) {
        System.out.println(new FourSumII().fourSumCount(new int[]{-1,-1}, new int[]{-1,1}, new int[]{-1,1}, new int[]{1,-1}));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer, Integer> sumCount = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                sumCount.put(a + b, sumCount.containsKey(a+b) ? sumCount.get(a+b) + 1 : 1);
            }
        }

        for (int c : C) {
            for (int d : D) {
                if (sumCount.containsKey(-(c+d))) {
                    count+= sumCount.get(-(c+d));
                }
            }
        }
        return count;
    }
}

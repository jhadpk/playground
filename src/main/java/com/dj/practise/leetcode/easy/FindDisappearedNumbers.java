package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 12/24/19
 * @project playground
 */
public class FindDisappearedNumbers {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/


    public static void main(String[] args) {
        new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1,1});
    }


    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            temp[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp[i] == 0) {
                result.add(i + 1);
            }
        }





        //PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        //for (int n : nums) {
        //    if (!pQueue.contains(n)) {
        //        pQueue.add(n);
        //    }
        //}
        //
        //for (int i = 1; i <= nums.length; i++) {
        //    if (null != pQueue.peek()) {
        //        if (i == pQueue.peek()) {
        //            pQueue.poll();
        //        } else {
        //            result.add(i);
        //        }
        //    } else {
        //      result.add(i);
        //    }
        //}
        return result;
    }

}

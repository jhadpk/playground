package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 12/23/19
 * @project playground
 */
public class MoveZeroes {
    //https://leetcode.com/problems/move-zeroes/


    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0,1,0,3,12});
    }
    public void moveZeroes(int[] nums) {
        if (nums.length != 0) {
            List<Integer> q = new ArrayList<>();
            for (int num : nums) {
                if (num != 0) {
                    q.add(num);
                }
            }
            int zeroCount = nums.length - q.size();
            for (int i = 0; i < zeroCount; i++) {
                q.add(0);
            }
            for (int i = 0; i < q.size(); i++) {
                nums[i] = q.get(i);
            }
        }
    }

}
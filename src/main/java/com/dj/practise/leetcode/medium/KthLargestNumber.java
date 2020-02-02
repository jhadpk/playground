package com.dj.practise.leetcode.medium;

import java.util.PriorityQueue;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class KthLargestNumber {
    //https://leetcode.com/problems/kth-largest-element-in-an-array/


    public static void main(String[] args) {
        new KthLargestNumber().findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> kLargest = new PriorityQueue<>(k);

        for (int n : nums) {
            kLargest.add(n);
            if (kLargest.size() > k) {
                kLargest.poll();
            }
        }

        return kLargest.peek();
    }
}

package com.dj.practise.leetcode.easy;

import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class SquaresSortedArray {
    //https://leetcode.com/problems/squares-of-a-sorted-array/

    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int n : A) {
            pQueue.add((int) Math.pow(n,2));
        }

        int i = 0;
        while (!pQueue.isEmpty()) {
            result[i] = pQueue.poll();
            i++;
        }
        return result;
    }
}

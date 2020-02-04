package com.dj.practise.leetcode.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * @author deepakjha on 12/24/19
 * @project playground
 */
public class MajorityElement {
    //https://leetcode.com/problems/majority-element/

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.containsKey(n) ? countMap.get(n) + 1 : 1);
        }

        Comparator<Map.Entry<Integer, Integer>> comparator = (o1, o2) -> o2.getValue() - o1.getValue();
        PriorityQueue<Map.Entry<Integer, Integer>> pQueue = new PriorityQueue<>(comparator);
        pQueue.addAll(countMap.entrySet());
        //
        //
        //List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        //sortedList.sort(comparator);
        //if (sortedList.get(0).getValue() > nums.length / 2) {
        //    return sortedList.get(0).getKey();
        //}
        return pQueue.poll().getKey();
    }
}

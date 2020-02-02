package com.dj.practise.leetcode.medium;

import java.util.*;


/**
 * @author deepakjha on 12/17/19
 * @project playground
 */
public class TopKFrequentElements {
    //https://leetcode.com/problems/top-k-frequent-elements/


    public static void main(String[] args) {
        int[] num = {4,1,-1,2,-1,2,3};
        System.out.println(new TopKFrequentElements().topKFrequent(num, 2));
    }


    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.containsKey(n) ? countMap.get(n) + 1 : 1);
        }

        PriorityQueue<Node> pQueue = new PriorityQueue<>((o1, o2) -> o2.occurrence - o1.occurrence);
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            pQueue.add(new Node(entry.getKey(), entry.getValue()));
        }

        for (int i = 0; i < k; i++) {
            result.add(pQueue.poll().num);
        }
        return result;
    }
}

class Node {
    int num;
    int occurrence;

    Node (int num, int occurrence) {
        this.num = num;
        this.occurrence = occurrence;
    }
}

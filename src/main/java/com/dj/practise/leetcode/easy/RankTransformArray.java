package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * @author deepakjha on 2/1/20
 * @project playground
 */
public class RankTransformArray {
    //https://leetcode.com/problems/rank-transform-of-an-array/

    public int[] arrayRankTransform(int[] arr) {
        int[] rankArr = new int[arr.length];

        Map<Integer, List<Integer>> valueIndexMap = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> indices = valueIndexMap.containsKey(arr[i]) ? valueIndexMap.get(arr[i]) : new ArrayList<>();
            indices.add(i);
            valueIndexMap.put(arr[i], indices);
        }

        int rank = 1;
        for (Map.Entry<Integer, List<Integer>> entry : valueIndexMap.entrySet()) {
            for (int index : entry.getValue()) {
                rankArr[index] = rank;
            }
            rank++;
        }
        return rankArr;
    }
}

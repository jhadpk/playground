package com.dj.practise.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class MaxIncreaseKeepingSkyline {
    //https://leetcode.com/problems/max-increase-to-keep-city-skyline/

    public static void main(String[] args) {
        System.out.println(new MaxIncreaseKeepingSkyline().maxIncreaseKeepingSkyline(new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}}));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;
        Map<Integer, Integer> rowMax = new HashMap<>();
        Map<Integer, Integer> colMax = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rowMax.put(i, rowMax.containsKey(i) ? grid[i][j] > rowMax.get(i) ? grid[i][j] : rowMax.get(i) : grid[i][j]);
                colMax.put(j, colMax.containsKey(j) ? grid[i][j] > colMax.get(j) ? grid[i][j] : colMax.get(j) : grid[i][j]);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int min = Math.min(rowMax.get(i), colMax.get(j));
                if (grid[i][j] < min) {
                    count += min - grid[i][j];
                }
            }
        }
        return count;
    }
}

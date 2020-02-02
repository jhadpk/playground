package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class RotateImage {
    //https://leetcode.com/problems/rotate-image/

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        new RotateImage().rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        if (n == 0) return;

        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int col = 0; col <= n; col++) {
            List<Integer> colUpside = new ArrayList<>();
            for (int row = n; row >= 0; row--) {
                colUpside.add(matrix[row][col]);
            }
            map.put(col, colUpside);
        }

        int row = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int col = 0;
            for (int num : entry.getValue()) {
                matrix[row][col] = num;
                col++;
            }
            row++;
        }
    }
}

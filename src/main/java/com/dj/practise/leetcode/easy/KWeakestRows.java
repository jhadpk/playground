package com.dj.practise.leetcode.easy;

import java.util.*;

/**
 * @author deepakjha on 2/1/20
 * @project playground
 */
public class KWeakestRows {
    //https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

    public static void main(String[] args) {
        int[][] mat = new int[][] {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        new KWeakestRows().kWeakestRows(mat, 3);
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> rowSoldierMap = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                soldiers++;
            }
            rowSoldierMap.put(i, soldiers);
        }

        Comparator<Map.Entry<Integer, Integer>> comparator = Comparator.comparingInt(Map.Entry::getValue);
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(rowSoldierMap.entrySet());
        sortedList.sort(comparator);

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            result[i] = entry.getKey();
            i++;
            if (i == k) {
                return result;
            }
        }

        return result;
    }
}

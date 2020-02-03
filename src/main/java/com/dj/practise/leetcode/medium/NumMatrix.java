package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class NumMatrix {
    //https://leetcode.com/problems/range-sum-query-2d-immutable/

    int[][] dp; //this stores the sum of sub rectangle formed b/w (0,0) and (i,j)

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
                dp[i][j] = rowSum + (i < 1 ? 0 : dp[i-1][j]);
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        //break down the matrix into multiple rectangles so as to figure out actual sum

        int bigRectangle = dp[row2][col2];
        int rectangle1 = col1 > 0 ? dp[row2][col1 - 1] : 0;
        int rectangle2 = row1 > 0 ? dp[row1 - 1][col2] : 0;
        int toBeAdded = row1 > 0 && col1 > 0 ? dp[row1 - 1][col1 - 1] : 0;
        return bigRectangle + toBeAdded - rectangle1 - rectangle2;
    }
}

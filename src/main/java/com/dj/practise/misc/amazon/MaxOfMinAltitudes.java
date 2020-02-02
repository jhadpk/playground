package com.dj.practise.misc.amazon;

/**
 * @author deepakjha
 * @project playground
 */
public class MaxOfMinAltitudes {

    public static void main(String[] args) {

        int[][] grid = new int[][]{{20, 20, 3}, {20, 3, 20}, {3, 20, 20}}; // 3
        System.out.println(new MaxOfMinAltitudes().maxScore2D(grid));
    }

    private int maxScore2D(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[][] dp = new int[r][c];

        dp[0][0] = Integer.MAX_VALUE;
        dp[r - 1][c - 1] = Integer.MAX_VALUE;

        for (int i = 1; i < c; i++) {
            dp[0][i] = Math.min(dp[0][i - 1], grid[0][i]);
        }
        for (int j = 1; j < r; j++) {
            dp[j][0] = Math.min(dp[j - 1][0], grid[j][0]);
        }

        for (int col = 1; col < c; col++) {
            for (int row = 1; row < r; row++) {
                if (row == r - 1 && col == c - 1) {
                    dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]);
                } else {
                    int top = Math.min(dp[row - 1][col], grid[row][col]); // down
                    int left = Math.min(dp[row][col - 1], grid[row][col]); // right
                    dp[row][col] = Math.max(top, left);
                }
            }
        }
        return dp[r - 1][c - 1];
    }


}

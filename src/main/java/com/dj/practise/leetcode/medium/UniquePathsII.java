package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class UniquePathsII {
    //https://leetcode.com/problems/unique-paths-ii/submissions/


    public static void main(String[] args) {
        System.out.println(new UniquePathsII().uniquePathsWithObstacles(new int[][]{{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}}));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];
        paths[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int j = 1; j < obstacleGrid[0].length; j++) {
            paths[0][j] = obstacleGrid[0][j] == 1 || paths[0][j-1] == 0 ? 0 : 1;
        }

        for (int i = 1;  i < obstacleGrid.length;  i++) {
            paths[i][0] = obstacleGrid[i][0] == 1 || paths[i-1][0] == 0 ? 0 : 1;
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                int ways = 0;
                if (obstacleGrid[i][j] != 1) {
                    if (obstacleGrid[i-1][j] != 1) {
                        ways += paths[i-1][j];
                    }
                    if (obstacleGrid[i][j-1] != 1) {
                        ways += paths[i][j-1];
                    }
                    paths[i][j] = ways;
                }
            }
        }
        return paths[obstacleGrid.length - 1][obstacleGrid[0].length -1];
    }

}

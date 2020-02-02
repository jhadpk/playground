package com.dj.practise.misc.dp.recursion;

/**
 * @author deepakjha on 10/11/19
 * @project geeks-for-geeks
 */
public class ClimbingStairsWithoutMemoization {

    // You can climb 2 stairs or 1 stair at a time
    public static void main(String[] args) {
        System.out.println(new ClimbingStairsWithoutMemoization().climbingWays(6));
    }

    private int climbingWays(int stairs) {
        return climbingWaysHelper(stairs);
    }

    private int climbingWaysHelper(int stairs) {
        if (stairs < 0) {
            return 0;
        }

        if (stairs == 0) {
            return 1;
        }

        return climbingWaysHelper(stairs - 1) + climbingWaysHelper(stairs - 2);
    }

}

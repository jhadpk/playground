package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/5/20
 * @project playground
 */
public class ContainerWithMostWater {
    //https://leetcode.com/problems/container-with-most-water/

    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}

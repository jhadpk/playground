package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/8/20
 * @project inmobi-rtb-validator
 */
public class MaxProductSubarray {
    //https://leetcode.com/problems/maximum-product-subarray/


    public static void main(String[] args) {
        System.out.println(new MaxProductSubarray().maxProduct(new int[]{0,2}));
    }

    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j <= i; j++) {
                product *= nums[j];
            }
            maxProduct = Math.max(maxProduct, product);
        }

        return maxProduct;
    }
}

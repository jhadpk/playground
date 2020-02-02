package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 1/3/20
 * @project playground
 */
public class ProductExceptSelf {
    //https://leetcode.com/problems/product-of-array-except-self/


    public static void main(String[] args) {
        new ProductExceptSelf().productExceptSelf(new int[] {
                1,
                2,
                3,
                4
        });
    }


    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 1) { return new int[] {nums[0]}; }
        int[] productOfLeftElements = new int[nums.length];
        int[] productOfRightElements = new int[nums.length];
        productOfLeftElements[0] = 1;
        productOfRightElements[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            productOfLeftElements[i] = productOfLeftElements[i-1] * nums[i-1];
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            productOfRightElements[j] = productOfRightElements[j + 1] * nums[j + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = productOfLeftElements[i] * productOfRightElements[i];
        }
        return result;
    }
}

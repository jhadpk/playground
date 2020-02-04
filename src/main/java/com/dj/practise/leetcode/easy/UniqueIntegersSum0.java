package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class UniqueIntegersSum0 {
    //https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/


    public static void main(String[] args) {
        System.out.println(new UniqueIntegersSum0().sumZero(4));
    }

    public int[] sumZero(int n) {
        int[] result = new int[n];

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                result[i] = i + 1;
                result[i+1] = -(i+1);
                i++;
            }
        } else {
            result[0] = 0;

            for (int i = 1; i < n-1; i++) {
                result[i] = i + 1;
                result[i+1] = -(i+1);
                i=i+1;
            }
        }
        return result;
    }
}

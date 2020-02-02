package com.dj.practise.leetcode.hard;

import java.util.Arrays;


/**
 * @author deepakjha on 12/19/19
 * @project playground
 */
public class MedianOfSortedArrays {
    //4. Median of Two Sorted Arrays of different lengths https://leetcode.com/problems/median-of-two-sorted-arrays/


    //INCORRECT TILL NOW



    public static void main(String[] args) {
        //System.out.println(new MedianOfSortedArrays().findMedianSortedArrays(new int[] {1,3}, new int[] {2}));
        //System.out.println(new MedianOfSortedArrays().findMedianSortedArrays(new int[] {3}, new int[] {-2,-1}));
        System.out.println(new MedianOfSortedArrays().findMedianSortedArrays(new int[] {1,2}, new int[] {1,2,3}));

    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0) {
            return len2 % 2 != 0 ? nums2[(len2 - 1) / 2] : (double) (nums2[len2 / 2] + nums2[len2 / 2 - 1]) / 2;
        }
        if (len2 == 0) {
            return len1 % 2 != 0 ? nums1[(len1 - 1) / 2] : (double) (nums1[len1 / 2] + nums1[len1 / 2 - 1]) / 2;
        }
        if (len1 == 1 && len2 == 1) {
            return (double) (nums1[0] + nums2[0]) / 2;
        }

        if (len1 == 2 && len2 == 2) {
            return (double) (Math.max(nums1[0], nums2[0]) + Math.min(nums1[1], nums2[1])) / 2;
        }

        double m1 = len1 % 2 != 0 ? nums1[len1 / 2] : (double) (nums1[len1 / 2] + nums1[len1 / 2 - 1]) / 2;
        double m2 = len2 % 2 != 0 ? nums2[len2 / 2] : (double) (nums2[len2 / 2] + nums2[len2 / 2 - 1]) / 2;

        if (m1 == m2) {
            return m1;
        } else if (m1 < m2) {
            int m1Index = len1 % 2 != 0 ? len1 / 2 + 1 : len1 / 2;
            int m2Index = len2 / 2;
            int[] nums1New = Arrays.copyOfRange(nums1, m1Index, nums1.length);
            int[] nums2New = Arrays.copyOfRange(nums2, 0, m2Index);
            return findMedianSortedArrays(nums1New, nums2New);
        } else {
            int m2Index = len2 % 2 != 0 ? len2 / 2 + 1 : len2 / 2;
            int m1Index = len1 / 2;
            int[] nums2New = Arrays.copyOfRange(nums2, m2Index, nums2.length);
            int[] nums1New = Arrays.copyOfRange(nums1, 0, m1Index);
            return findMedianSortedArrays(nums2New, nums1New);
        }
    }
}

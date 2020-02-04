package com.dj.practise.leetcode.easy;

import java.util.Map;


/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class GreatestElementOnRight {
    //https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

    public int[] replaceElements(int[] arr) {
        int[] greaterRight = new int[arr.length];
        greaterRight[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            greaterRight[i] = Math.max(greaterRight[i+1], arr[i+1]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = greaterRight[i];
        }
        return arr;
    }
}

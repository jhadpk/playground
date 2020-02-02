package com.dj.practise.misc.array;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 12/17/19
 * @project playground
 */
public class FindCommonElementsInArrays {
    //https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/

    public static void main(String args[]) {
        FindCommonElementsInArrays ob = new FindCommonElementsInArrays();

        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(ob.findCommon(ar1, ar2, ar3));
    }


    private List<Integer> findCommon(int[] ar1, int[] ar2, int[] ar3) {
        List<Integer> output = new ArrayList<>();
        int ar1Len = ar1.length;
        int ar2Len = ar2.length;
        int ar3Len = ar3.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < ar1Len && j < ar2Len && k < ar3Len) {
            if (ar1[i] == ar2[j] && ar1[i] == ar3[k]) {
                output.add(ar1[i]);
                i++;
                j++;
                k++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else if (ar2[j] < ar3[k]) {
                j++;
            } else {
                k++;
            }

        }
        return output;
    }
}

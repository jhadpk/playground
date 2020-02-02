package com.dj.practise.practise;

import java.util.Map;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class LCM {


    public static void main(String[] args) {
        System.out.println(new LCM().findLcm(12, 18));
    }

    /***
     * LCM of two numbers is their product divided by their HCF/GCD
     */
    private int findLcm(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        int hcf = findHcf(a, b);
        return (a*b) / hcf;
    }

    private int findHcf(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;

        if (a > b) {
            return findHcf(a - b, b);
        } else {
            return findHcf(a, b - a);
        }
    }

}

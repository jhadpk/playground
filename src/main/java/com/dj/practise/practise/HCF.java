package com.dj.practise.practise;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class HCF {
    //https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/

    public static void main(String[] args) {
        System.out.println(new HCF().findHcf(98, 56));
    }

    /***
        HCF of two numbers doesnt change if smaller is subtracted from larger one
     */
    private int findHcf(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;

        if (a > b) {
            return findHcf(a-b, b);
        } else {
            return findHcf(a, b-a);
        }
    }
}

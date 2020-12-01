package com.dj.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author deepakjha on 9/23/20
 * @project inmobi-rtb-validator
 */
public class prisonBreak {

    public static void main(String[] args) {

        //List<Integer> arr = new ArrayList<>();
        //arr.add(0);
        //arr.add(1);
        //arr.add(2);
        //arr.add(3);
        //arr.add(4);
        //arr.add(5);
        //arr.add(6);
        //
        ////arr.remove(3);
        //arr.removeIf(x -> x.equals(3));
        //System.out.println(arr);
        //
        ////arr.remove(4);
        //arr.removeIf(x -> x.equals(4));
        //
        //System.out.println(arr);



        int n = 3;
        int m = 3;
        List<Integer> h = new ArrayList<>(Arrays.asList(1,2));
        List<Integer> v = new ArrayList<>(Arrays.asList(2));
        System.out.println(prison(n, m, h, v));


    }

    public static long prison(int n, int m, List<Integer> h, List<Integer> v) {
        if (h.size() == 0 && v.size() == 0) return ((m+1) * (n+1));

        List<Integer> horizontal = new ArrayList<>();
        List<Integer> vertical = new ArrayList<>();

        for (int i = 0; i <= n+1; i++) {
            horizontal.add(i);
        }

        for (int i = 0; i <= m+1; i++) {
            vertical.add(i);
        }

        for (int hbar : h) {
            horizontal.removeIf(x -> x == hbar);
    }

        for (int vbar : v) {
            vertical.removeIf(x -> x == vbar);
        }

        int maxLength = 0;
        for (int i = 1; i < horizontal.size(); i++) {
            if (i == 1) {
                maxLength = horizontal.get(i);
            } else {
                maxLength = Math.max(horizontal.get(i) - horizontal.get(i-1), maxLength);
            }
        }

        int maxBreadth = 0;
        for (int i = 1; i < vertical.size(); i++) {
            if (i == 1) {
                maxBreadth = vertical.get(i);
            } else {
                maxBreadth = Math.max(vertical.get(i) - vertical.get(i-1), maxBreadth);
            }
        }
        return maxBreadth * maxLength;
    }





















}

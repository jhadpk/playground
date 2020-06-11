package com.dj.practise.leetcode.others;

/**
 * @author deepakjha on 4/2/20
 * @project playground
 */
public class SpirographPointGen {

    public static void main(String[] args) {
        int R = 5, r = 1, a = 4;
        double pi = (double) 22 / 7;

        double lat = 34.0208333; // Bovard lat
        double lon = -118.2855556; // Bovard long
        System.out.println(lon + "," + lat);

        for (double t = 0.0; t < (pi * 10); t += 0.05) {
            double x = ((R + r) * Math.cos(((float) r / R) * t) - a * Math.cos((1 + (float) r / R) * t)) / 10000;
            double y = ((R + r) * Math.sin(((float) r / R) * t) - a * Math.sin((1 + (float) r / R) * t)) / 10000;
            System.out.println(lon+ y + "," + (lat + x));
        }
    }
}

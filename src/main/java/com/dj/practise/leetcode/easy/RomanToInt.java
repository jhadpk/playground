package com.dj.practise.leetcode.easy;

import java.util.HashMap;
import java.util.Map;


/**
 * @author deepakjha on 1/7/20
 * @project inmobi-rtb-validator
 */
public class RomanToInt {
    //https://leetcode.com/problems/roman-to-integer/


    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("III"));
    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        String[] romans = s.split("");
        int num = 0;
        for (int i = 0; i < romans.length; i++) {
            if (i + 1 <= romans.length - 1) {
                if (map.containsKey(romans[i] + romans[i + 1])) {
                    num += map.get(romans[i] + romans[i + 1]);
                    i++;
                    continue;
                }
            }
            num += map.get(romans[i]);
        }
        return num;
    }
}

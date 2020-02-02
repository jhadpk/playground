package com.dj.practise.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deepakjha on 1/31/20
 * @project playground
 */
public class DecodeString {
    //https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/


    public static void main(String[] args) {
        new DecodeString().freqAlphabets("1");
    }

    public String freqAlphabets(String s) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(9, "i");
        map.put(10, "j");
        map.put(11, "k");
        map.put(12, "l");
        map.put(13, "m");
        map.put(14, "n");
        map.put(15, "o");
        map.put(16, "p");
        map.put(17, "q");
        map.put(18, "r");
        map.put(19, "s");
        map.put(20, "t");
        map.put(21, "u");
        map.put(22, "v");
        map.put(23, "w");
        map.put(24, "x");
        map.put(25, "y");
        map.put(26, "z");

        if (s.length() == 1) {
            return map.get(Integer.parseInt(s));
        }

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            int digit;
            StringBuilder dig = new StringBuilder();
            if (s.charAt(i) == '#') {
                dig = dig.append(s.charAt(i - 2)).append(s.charAt(i - 1));
                digit = Integer.parseInt(dig.toString());
                i = i - 3;
            } else {
                digit = Integer.parseInt(String.valueOf(s.charAt(i)));
                i--;
            }
            result.append(map.get(digit));
        }

        StringBuilder output = new StringBuilder();
        for (int x = result.length() - 1; x >= 0; x--) {
            output.append(result.charAt(x));
        }

        return output.toString();
    }

}

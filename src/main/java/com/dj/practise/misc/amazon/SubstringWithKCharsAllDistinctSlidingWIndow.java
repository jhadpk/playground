package com.dj.practise.misc.amazon;

import java.util.HashSet;


/**
 * @author deepakjha
 * @project playground
 */
public class SubstringWithKCharsAllDistinctSlidingWIndow {

    public static String[] substringK(String s, int k) {
        HashSet<String> output = new HashSet<>();
        String substr = "";
        char[] inputCharArray = s.toCharArray();
        for (Character c : inputCharArray) {
            if (substr.indexOf(c) < 0) {
                substr = substr + c;
            } else {
                int index = substr.indexOf(c);
                substr = substr.substring(index + 1);
                substr = substr + c;
            }
            if (substr.length() == k) {
                output.add(substr);
                substr = substr.substring(1);
            }
        }

        String[] outputArray = new String[output.size()];
        int i = 0;
        for (String str : output) {
            outputArray[i] = str;
            i++;
        }
        return outputArray;
    }


    public static void main(String[] args) {
        String[] out = substringK("abcabc", 3);
        for (String output : out) {
            System.out.println(output);
        }
    }
}

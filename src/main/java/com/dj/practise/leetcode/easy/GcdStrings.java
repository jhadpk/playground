package com.dj.practise.leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class GcdStrings {
    //https://leetcode.com/problems/greatest-common-divisor-of-strings/

    public static void main(String[] args) {
        System.out.println(new GcdStrings().gcdOfStrings("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    public String gcdOfStrings(String str1, String str2) {
        String smallerStr = str1.length() > str2.length() ? str2 : str1;

        String[] chars = smallerStr.split("");
        Queue<String> queue = new LinkedList<>(Arrays.asList(chars));

        String result = "";
        StringBuilder polled = new StringBuilder();
        while (!queue.isEmpty()) {
            polled.append(queue.poll());
            String replaced1 = str1.replaceAll(polled.toString(), "");
            String replaced2 = str2.replaceAll(polled.toString(), "");

            if (replaced1.isEmpty() && replaced2.isEmpty()) {
                result = polled.toString();
            }
        }
        return result.length() > 0 ? result : "";
    }
}

package com.dj.practise.leetcode.easy;

import java.util.HashSet;
import java.util.Set;


/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class FirstNonRepeatingChar {
    //https://leetcode.com/problems/first-unique-character-in-a-string/


    public static void main(String[] args) {
        System.out.println(new FirstNonRepeatingChar().firstUniqChar("dddccdbba"));
    }

    public int firstUniqChar(String s) {
        if (s.length() == 0) return -1;
        if (s.length() == 1) return 0;
        Set<String> isDuplicate = new HashSet<>();
        String[] chars = s.split("");

        for (int i = 0; i < chars.length; i++) {
            String c = chars[i];
            String str = s.substring(i+1);
            if (!str.contains(c) && !isDuplicate.contains(c)) {
                return i;
            }
            isDuplicate.add(c);
        }
        return -1;
    }

}

package com.dj.practise.leetcode.easy;

import java.util.HashMap;
import java.util.Map;


/**
 * @author deepakjha on 2/3/20
 * @project playground
 */
public class WordPattern {

    //https://leetcode.com/problems/word-pattern/


    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("ababa", "dog asd dog asd dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();

        char[] chars = pattern.toCharArray();

        String[] strs = str.split(" ");

        if (strs.length != chars.length) return false;

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                if (!map.get(chars[i]).equals(strs[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(strs[i])) {
                    for (Map.Entry<Character, String> entry : map.entrySet()) {
                        if (entry.getValue().equals(strs[i])) {
                            if (entry.getKey() != chars[i]) {
                                return false;
                            }
                        }
                    }
                }
                map.put(chars[i], strs[i]);
            }
        }
        return true;
    }
}

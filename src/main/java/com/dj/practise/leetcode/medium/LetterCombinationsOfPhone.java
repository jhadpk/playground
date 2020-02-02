package com.dj.practise.leetcode.medium;

import java.util.*;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class LetterCombinationsOfPhone {
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/


    public static void main(String[] args) {
        new LetterCombinationsOfPhone().letterCombinations("23");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        map.put("2", Arrays.asList("a","b","c"));
        map.put("3", Arrays.asList("d","e","f"));
        map.put("4", Arrays.asList("g","h","i"));
        map.put("5", Arrays.asList("j","k","l"));
        map.put("6", Arrays.asList("m","n","o"));
        map.put("7", Arrays.asList("p","q","r","s"));
        map.put("8", Arrays.asList("t","u","v"));
        map.put("9", Arrays.asList("w","x","y","z"));

        String[] str = digits.split("");

        List<String> result = new ArrayList<>(map.get(str[0]));

        for (int i = 1; i < str.length; i++) {
            result = helper(map.get(str[i]), result);
        }
        return result;
    }

    private List<String> helper(List<String> input, List<String> present) {
        List<String> result = new ArrayList<>();

        for (String x : present) {
            for (String y : input) {
                result.add(x + y);
            }
        }

        return result;
    }
    
    
}

package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author deepakjha on 1/4/20
 * @project playground
 */
public class GroupAnagrams {
    //https://leetcode.com/problems/group-anagrams/


    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sorted = Stream.of(str.split("")).sorted().collect(Collectors.joining());
            List<String> value = map.containsKey(sorted) ? map.get(sorted) : new ArrayList<>();
            value.add(str);
            map.put(sorted, value);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }


    private boolean isAnagram(String str1, String str2) {
        String sorted1 = Stream.of(str1.split("")).sorted().collect(Collectors.joining());
        String sorted2 = Stream.of(str2.split("")).sorted().collect(Collectors.joining());
        return sorted1.equals(sorted2);
    }
}

package com.dj.practise.practise;

import java.util.*;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class HashMapSort {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "xyz");
        hashMap.put("z", "asd");
        hashMap.put("m", "fgs");
        hashMap.put("d", "wed");
        hashMap.put("f", "ada");
        hashMap.put("x", "qwe");
        hashMap.put("o", "hfg");

        //Sorting By Keys
        Map<String, String> sortByKey = new TreeMap<>(hashMap);
        for (Map.Entry<String, String> entry : sortByKey.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("________________________");
        System.out.println();

        //Sorting By Value
        Map<String, String> sortByValue = new LinkedHashMap<>();
        Comparator<Map.Entry<String, String>> comparator = new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        List<Map.Entry<String, String>> listEntries = new ArrayList<>(hashMap.entrySet());
        listEntries.sort(comparator);
        for (Map.Entry<String, String> listEntry : listEntries) {
            sortByValue.put(listEntry.getKey(), listEntry.getValue());
        }
        for (Map.Entry<String, String> entry : sortByValue.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

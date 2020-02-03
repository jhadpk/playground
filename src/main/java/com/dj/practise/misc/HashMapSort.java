package com.dj.practise.misc;

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

        //Sorting By Keys Ascending Order
        System.out.println("Sorting By Keys Ascending Order");
        Map<String, String> sortByKey = new TreeMap<>(hashMap);
        for (Map.Entry<String, String> entry : sortByKey.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("________________________");
        System.out.println();

        //Sorting By Keys Descending Order
        System.out.println("Sorting By Keys Descending Order");
        Map<String, String> sortByKeyDesc = new TreeMap<>(hashMap);
        List<Map.Entry<String, String>> sortedList = new ArrayList<>(sortByKeyDesc.entrySet());
        Comparator<Map.Entry<String, String>> descKey = new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        };
        sortedList.sort(descKey);
        for (Map.Entry<String, String> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("________________________");
        System.out.println();


        //Sorting By Value Ascending Order
        System.out.println("Sorting By Value Ascending Order");
        Map<String, String> sortByValue = new LinkedHashMap<>(); //no need to create this, can output from sorted list too
        Comparator<Map.Entry<String, String>> ascValue = new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        List<Map.Entry<String, String>> listEntries = new ArrayList<>(hashMap.entrySet());
        listEntries.sort(ascValue);
        for (Map.Entry<String, String> listEntry : listEntries) {
            sortByValue.put(listEntry.getKey(), listEntry.getValue());
        }
        for (Map.Entry<String, String> entry : sortByValue.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("________________________");
        System.out.println();


        //Sorting By Value Ascending Order
        System.out.println("Sorting By Value Descending Order");
        Map<String, String> sortByValueDesc = new LinkedHashMap<>();
        Comparator<Map.Entry<String, String>> descValue = new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };
        List<Map.Entry<String, String>> listEntriesDesc = new ArrayList<>(hashMap.entrySet());
        listEntriesDesc.sort(descValue);
        for (Map.Entry<String, String> entry : listEntriesDesc) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

package com.dj.practise.leetcode.others;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author deepakjha
 * @project playground
 */
public class MaxHotelRoom {


    public static void main(String[] args) {
        String[] a = new String[4];
//        a[0] = "+1A";
//        a[1] = "-1A";
//        a[2] = "+3F";
//        a[3] = "-3F";
//        a[4] = "+3F";
//        a[5] = "+8X";

        a[0] = "+9A";
        a[1] = " -9A";
        a[2] = " +7A";
        a[3] = " -7A";
        a[3] = " +3B";



        System.out.println(solution(a));
    }


    public static String solution(String[] A) {
        // Your solution goes here.

        HashMap<String, Integer> hotelBookingsMap = new HashMap<>();
        for (final String booking : A) {
            String roomNumber = booking.trim().substring(1);
            int count = hotelBookingsMap.getOrDefault(roomNumber, 0);
            hotelBookingsMap.put(roomNumber, count + 1);
        }

        for (Map.Entry<String, Integer> bookingEntry : hotelBookingsMap.entrySet()) {
            int actualValue = (bookingEntry.getValue() % 2 != 0) ? bookingEntry.getValue() + 1 : bookingEntry.getValue();
            bookingEntry.setValue(actualValue / 2);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(hotelBookingsMap);
        Map.Entry<String, Integer> max = null;
        for (final Map.Entry<String, Integer> data : sortedMap.entrySet()) {
            if (max == null || data.getValue().compareTo(max.getValue()) >=0) {
                max = data;
            }
        }
        return max.getKey();
    }
}

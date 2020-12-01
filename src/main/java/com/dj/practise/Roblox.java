package com.dj.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author deepakjha on 9/23/20
 * @project inmobi-rtb-validator
 */
public class Roblox {

    public static void main(String[] args) {
        List<Long> boxes = Arrays.asList(1L, 2L, 3L, 100L,250L, 300L, 10L);
        List<Long> unitsPerBox = Arrays.asList(3L, 2L, 1L, 20L, 100L,150L,135L);
        long truckSize = 30000L;

        System.out.println(getMaxUnits(boxes, unitsPerBox, truckSize));
    }

    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        if (boxes.size() != unitsPerBox.size()) return 0;

        List<List<Long>> boxUnitList = new ArrayList<>();
        for (int i = 0; i < boxes.size(); i++) {
            boxUnitList.add(Arrays.asList(boxes.get(i), unitsPerBox.get(i)));
        }
        boxUnitList = boxUnitList.stream().sorted((o1,o2) -> o2.get(1).compareTo(o1.get(1))).collect(Collectors.toList());

        int x = 0;
        long total = 0;
        while (truckSize > 0 && x < boxUnitList.size()) {
            if (boxUnitList.get(x).get(0) <= truckSize) {
                total += (boxUnitList.get(x).get(0) * boxUnitList.get(x).get(1));
                truckSize -= boxUnitList.get(x).get(0);
            } else {
                total += truckSize * boxUnitList.get(x).get(1);
                truckSize = 0;
            }
            if (truckSize <= 0) return total;

            x++;
        }
        return total;
    }

}

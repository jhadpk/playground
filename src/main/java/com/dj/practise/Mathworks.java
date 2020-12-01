package com.dj.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


/**
 * @author deepakjha on 9/12/20
 * @project inmobi-rtb-validator
 */
public class Mathworks {

    private List<Integer> getMaxOccurrenceListFromIndex(final List<Integer> indexList, final List<Integer> valuesList) {
        List<Integer> listToReturn = new ArrayList<>();
        HashMap<Integer, List<Integer>> mapIndexToSubList = new HashMap<>();

        for (int i = 0; i < valuesList.size(); i++) {
            List<Integer> sublist = valuesList.subList(i, valuesList.size() - 1);
            mapIndexToSubList.put(i,sublist);
        }

        for (int index : indexList) {
            List<Integer> reqdSublist = mapIndexToSubList.get(index - 1);
            int maxValue = Collections.max(reqdSublist);
            int occurrences = Collections.frequency(reqdSublist, maxValue);
            listToReturn.add(occurrences);
        }
        return listToReturn;
    }


}

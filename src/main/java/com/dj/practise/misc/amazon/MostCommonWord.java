package com.dj.practise.misc.amazon;

import java.util.*;

/**
 * @author deepakjha
 * @project playground
 */
public class MostCommonWord {

    public static void main(String[] args) {
        String[] banned = new String[1];
        banned[0] = "hit";
        //banned[1] = "abcd";
        //banned[2] = "jeff";

        System.out.println(new MostCommonWord().mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));
        //System.out.println(new MostCommonWord().mostCommonWord("abc abc? abcd the jeff!", banned));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String paragraphReqd = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] words = paragraphReqd.split(" ");
        List<String> bannedList = Arrays.asList(banned);
        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty() && !word.equals(" ") && !bannedList.contains(word)) {
                occurrenceMap.put(word, null != occurrenceMap.get(word) ? occurrenceMap.get(word) + 1 : 1);
            }
        }

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        };
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(occurrenceMap.entrySet());
        sortedList.sort(comparator);
        return sortedList.get(0).getKey();
    }
}

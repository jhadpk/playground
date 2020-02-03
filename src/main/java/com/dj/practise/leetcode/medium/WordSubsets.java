package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class WordSubsets {
    //https://leetcode.com/problems/word-subsets/


    public static void main(String[] args) {
        System.out.println(new WordSubsets().wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","oo"}));
    }

    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();

        //stores max occurrence of character
        int[] bMax = count("");
        for (String b : B) {
            int[] bCount = count(b); //stores occurrence count for b
            for (int i = 0; i < 26; i++) {
                bMax[i] = Math.max(bMax[i], bCount[i]);
            }
        }

        StringBuilder updatedB = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (bMax[i] > 0) {
                int count = bMax[i];
                while (count > 0) {
                    int ascii = 97 + i; //gives character for index i
                    updatedB.append((char) ascii);
                    count--;
                }
            }
        }

        //search for each character in updatedB
        String[] chars = updatedB.toString().split("");
        for (String a : A) {
            result.add(a);
            for (String c : chars) {
                String temp = a;
                a = a.replaceFirst(c, "");
                if (temp.equals(a)) {
                    result.remove(result.size() - 1);
                    break;
                }
            }
        }
        return result;
    }

    private int[] count(String s) {
        int[] ans = new int[26];
        for (char c : s.toCharArray()) {
            ans[c - 'a']++;
        }
        return ans;
    }

}

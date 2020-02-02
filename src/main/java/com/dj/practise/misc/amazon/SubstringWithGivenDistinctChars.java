package com.dj.practise.misc.amazon;

import java.util.HashSet;
import java.util.Set;


/**
 * @author deepakjha
 * @project playground
 */
public class SubstringWithGivenDistinctChars {
    //https://leetcode.com/discuss/interview-question/370157
    public static void main(String[] args) {
        SubstringWithGivenDistinctChars ob = new SubstringWithGivenDistinctChars();
        String ch = "ababc";
        int k = 2;
        System.out.println(ob.countkDist(ch, k));
    }


    int countkDist(String str, int k) {
        int strSize = str.length();
        Set<Character> characterSet;
        int res = 0;

        for (int i = 0; i < strSize; i++) {
            characterSet = new HashSet<>();
            for (int x = i; x < strSize; x++) {
                characterSet.add(str.charAt(x));
                if (characterSet.size() == k) {
                    res++;
                }
                if (characterSet.size() > k) {
                    break;
                }
            }
        }
        return res;
    }
}

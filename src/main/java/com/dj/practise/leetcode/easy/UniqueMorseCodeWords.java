package com.dj.practise.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * @author deepakjha on 2/4/20
 * @project playground
 */
public class UniqueMorseCodeWords {
    //https://leetcode.com/problems/unique-morse-code-words/

    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> morseCode = new HashMap<>();
        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c', "-.-.");
        morseCode.put('d', "-..");
        morseCode.put('e', ".");
        morseCode.put('f', "..-.");
        morseCode.put('g', "--.");
        morseCode.put('h', "....");
        morseCode.put('i', "..");
        morseCode.put('j', ".---");
        morseCode.put('k', "-.-");
        morseCode.put('l', ".-..");
        morseCode.put('m', "--");
        morseCode.put('n', "-.");
        morseCode.put('o', "---");
        morseCode.put('p', ".--.");
        morseCode.put('q', "--.-");
        morseCode.put('r', ".-.");
        morseCode.put('s', "...");
        morseCode.put('t', "-");
        morseCode.put('u', "..-");
        morseCode.put('v', "...-");
        morseCode.put('w', ".--");
        morseCode.put('x', "-..-");
        morseCode.put('y', "-.--");
        morseCode.put('z', "--..");

        Set<String> sets = new HashSet<>();

        for (String word : words) {
            StringBuilder s = new StringBuilder();
            for (Character c : word.toCharArray()) {
                s.append(morseCode.get(c));
            }
            sets.add(s.toString());
        }
        return sets.size();
    }
}

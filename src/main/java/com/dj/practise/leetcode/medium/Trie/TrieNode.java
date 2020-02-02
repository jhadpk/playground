package com.dj.practise.leetcode.medium.Trie;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class TrieNode {

    Map<Character, TrieNode> map;
    boolean isEnd;

    public TrieNode() {
        map = new HashMap<>();
        isEnd = false;
    }

}

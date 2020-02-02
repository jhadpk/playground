package com.dj.practise.leetcode.medium.Trie;

/**
 * @author deepakjha on 1/13/20
 * @project playground
 */
public class Trie {

    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            node.map.putIfAbsent(c, new TrieNode());
            node = node.map.get(c);
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            node = node.map.get(c);
            if (node == null) {
                return false;
            }
        }
        return node.isEnd;
    }


    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            Character c = prefix.charAt(i);
            node = node.map.get(c);
            if (node == null) {
                return false;
            }
        }
        return true;
    }

}

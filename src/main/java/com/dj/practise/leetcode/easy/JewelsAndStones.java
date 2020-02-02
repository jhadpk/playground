package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deepakjha on 1/12/20
 * @project playground
 */
public class JewelsAndStones {
    //https://leetcode.com/problems/jewels-and-stones

    public int numJewelsInStones(String J, String S) {
        char[] stones = S.toCharArray();
        List<Character> jewels = new ArrayList<>();
        char[] jArr = J.toCharArray();
        for (char j : jArr) {
            jewels.add(j);
        }
        int count = 0;
        for (char s : stones) {
            if (jewels.contains(s)) {
                count++;
            }
        }
        return count;
    }
}

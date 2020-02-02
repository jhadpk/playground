package com.dj.practise.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class CountAndSay {
    //https://leetcode.com/problems/count-and-say/


    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(10));
    }

    public String countAndSay(int n) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "11");
        map.put(3, "21");
        map.put(4, "1211");
        map.put(5, "111221");

        if (n == 1) return map.get(1);
        if (n == 2) return map.get(2);
        if (n == 3) return map.get(3);
        if (n == 4) return map.get(4);
        if (n == 5) return map.get(5);

        StringBuilder res;
        for (int i = 6; i <= n; i++) {
            Queue<String> queue = new LinkedList<>(Arrays.asList(map.get(i-1).split("")));
            res = new StringBuilder();
            int count = 0;
            String polled = "";
            while (!queue.isEmpty()) {
                if (queue.peek().equals(polled)) {
                    count++;
                } else {
                    if (count != 0) {
                        res.append(count).append(polled);
                    }
                    count = 1;
                }
                polled = queue.poll();
                if (queue.isEmpty()) {
                    res.append(count).append(polled);
                }
            }
            map.put(i, res.toString());
        }
        return map.get(n);
    }

}

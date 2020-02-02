package com.dj.practise.leetcode.medium;

import java.util.Stack;


/**
 * @author deepakjha on 1/2/20
 * @project playground
 */
public class DailyTemperatures {
    //https://leetcode.com/problems/daily-temperatures/

    class Entry {
        int index;
        int temp;

        Entry(int index, int temp) {
            this.index = index;
            this.temp = temp;
        }
    }

    public int[] dailyTemperatures(int[] T) {
        if (T.length == 1) return new int[]{0};
        int[] result = new int[T.length];
        Stack<Entry> stack = new Stack<>();
        stack.push(new Entry(0, T[0]));
        for (int i = 1; i < T.length; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek().temp < T[i]) {
                    result[stack.peek().index] = i - stack.peek().index;
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(new Entry(i, T[i]));
        }
        return result;
    }
}

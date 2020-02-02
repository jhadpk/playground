package com.dj.practise.leetcode.easy;

import java.util.Stack;
import java.util.TreeMap;


/**
 * @author deepakjha on 12/31/19
 * @project playground
 */
public class MinStack {
    //https://leetcode.com/problems/min-stack/

    TreeMap<Integer, Integer> treeMap;
    private Stack<Integer> stack = new Stack<>();

    public MinStack() {
        treeMap = new TreeMap<>();
    }

    public void push(int x) {
        treeMap.put(x, treeMap.containsKey(x) ? treeMap.get(x) + 1 : 1);
        stack.push(x);
    }

    public void pop() {
        int popped = stack.pop();
        if (treeMap.get(popped) == 1) {
            treeMap.remove(popped);
        } else {
            treeMap.put(popped, treeMap.get(popped) - 1);
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return treeMap.entrySet().iterator().next().getKey();
    }
}

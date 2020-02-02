package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;

import java.util.Collections;
import java.util.TreeMap;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class MiddleOfLinkedList {
    //https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        TreeMap<Integer, ListNode> map = new TreeMap<>(Collections.reverseOrder());
        int index = 1;

        while (head != null) {
            map.put(index - 1, head);
            index++;
            head = head.next;
        }

        int length = map.entrySet().iterator().next().getKey() + 1;

        return map.get(length/2);
    }
}

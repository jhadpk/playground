package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;


/**
 * @author deepakjha on 1/1/20
 * @project playground
 */
public class LinkedListCycle {
    //https://leetcode.com/problems/linked-list-cycle/

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow.next != null && fast.next != null && fast.next.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

}

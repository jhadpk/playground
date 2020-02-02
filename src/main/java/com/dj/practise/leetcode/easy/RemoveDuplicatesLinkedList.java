package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class RemoveDuplicatesLinkedList {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        while (head.next != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return temp;
    }
}

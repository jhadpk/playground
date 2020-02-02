package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;

import java.util.HashSet;
import java.util.Set;


/**
 * @author deepakjha on 1/1/20
 * @project playground
 */
public class LinkedListIntersection {
    //https://leetcode.com/problems/intersection-of-two-linked-lists/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

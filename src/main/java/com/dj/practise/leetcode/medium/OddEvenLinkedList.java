package com.dj.practise.leetcode.medium;

import com.dj.practise.leetcode.helpers.ListNode;


/**
 * @author deepakjha on 1/8/20
 * @project inmobi-rtb-validator
 */
public class OddEvenLinkedList {
    //https://leetcode.com/problems/odd-even-linked-list/


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        //head.next.next.next.next.next.next.next = new ListNode(8);
        new OddEvenLinkedList().oddEvenList(head);
    }

    //creating two new pointers to even and odd nodes and in the end connecting odd.next to even head.
    //constant space, since we are not creating any new node.
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) { return head; }
        if (head.next.next == null) { return head; }
        ListNode even = head.next;
        ListNode evenHead = even;
        ListNode odd = head;
        ListNode node = head;
        boolean oddFlag = true;
        while (node != null && node.next != null) {
            if (oddFlag) {
                if (node.next.next != null) {
                    odd.next = node.next.next;
                    odd = odd.next;
                } else {
                    odd.next = null;
                }
                node = even;
                oddFlag = false;
            } else {
                if (node.next.next != null) {
                    even.next = node.next.next;
                } else {
                    even.next = null;
                }
                even = even.next;
                node = odd;
                oddFlag = true;
            }
        }
        odd.next = evenHead;
        return head;
    }
}

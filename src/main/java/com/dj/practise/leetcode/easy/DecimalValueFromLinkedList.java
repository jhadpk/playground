package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;


/**
 * @author deepakjha on 2/1/20
 * @project playground
 */
public class DecimalValueFromLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        System.out.println(new DecimalValueFromLinkedList().getDecimalValue(head));
    }

    public int getDecimalValue(ListNode head) {
        int num = 0;

        while (head != null) {
            num = num << 1 | head.val;
            head = head.next;
        }
        return num;
    }

}

package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;


/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class RemoveElementsLinkedList {
    //https://leetcode.com/problems/remove-linked-list-elements/


    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(1);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(2);

        new RemoveElementsLinkedList().removeElements(node, 2);
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;

        while (head != null && head.val == val) {
            temp = temp.next;
            head = head.next;
        }

        while (head != null) {
            if (head.next != null) {
                if (head.next.val == val) {
                    head.next = head.next.next;
                } else {
                    head = head.next;
                }
            } else {
                break;
            }
        }

        return temp;
    }
}

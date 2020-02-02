package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author deepakjha on 12/23/19
 * @project playground
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        new ReverseLinkedList().reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        HashMap<ListNode, ListNode> map = new LinkedHashMap<>();
        ListNode output = null;
        map.put(head, null);
        while (head != null) {
            if (head.next != null) {
                map.put(head.next, head);
            }
            head = head.next;
        }

        for (Map.Entry<ListNode, ListNode> e : map.entrySet()) {
            output = e.getKey();
            output.next = e.getValue();
        }
        return output;
    }
}

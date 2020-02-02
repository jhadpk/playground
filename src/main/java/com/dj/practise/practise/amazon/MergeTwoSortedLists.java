package com.dj.practise.practise.amazon;

/**
 * @author deepakjha
 * @project playground
 */
public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);


        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.println(new MergeTwoSortedLists().mergeTwoLists(l1, l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(-100000000);
        ListNode movingHead = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                //movingHead = setOutputHead(output, movingHead, l1);
                if (movingHead == null) {
                    movingHead = new ListNode(l1.val);
                    output.next = movingHead;
                    movingHead.next = null;
                } else {
                    ListNode node = new ListNode(l1.val);
                    node.next = null;
                    movingHead.next = node;
                    movingHead = movingHead.next;
                }
                l1 = l1.next;
            } else {
                //movingHead = setOutputHead(output, movingHead, l2);
                if (movingHead == null) {
                    movingHead = new ListNode(l2.val);
                    output.next = movingHead;
                    movingHead.next = null;
                } else {
                    ListNode node = new ListNode(l2.val);
                    node.next = null;
                    movingHead.next = node;
                    movingHead = movingHead.next;
                }
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            if (movingHead != null) {
                movingHead.next = l1;
            } else {
                return l1;
            }
        } else if (l2 != null) {
            if (movingHead != null) {
                movingHead.next = l2;
            } else {
                return l2;
            }
        }

        return output.next;
    }
}

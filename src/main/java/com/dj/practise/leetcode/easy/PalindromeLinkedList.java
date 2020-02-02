package com.dj.practise.leetcode.easy;

import com.dj.practise.leetcode.helpers.ListNode;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 1/1/20
 * @project playground
 */
public class PalindromeLinkedList {
    //https://leetcode.com/problems/palindrome-linked-list/


    public static void main(String[] args) {
        ListNode head = new ListNode(-129);
        head.next = new ListNode(-129);

        System.out.println(new PalindromeLinkedList().isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> arrList = new ArrayList<>();
        while (head != null) {
            arrList.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = arrList.size() - 1;

        while (i < j) {
            if (!arrList.get(i).equals(arrList.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

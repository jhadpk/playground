package com.dj.practise.leetcode.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * @author deepakjha on 1/8/20
 * @project inmobi-rtb-validator
 */
public class KthSmallestInSortedMatrix {
    //https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

    public static void main(String[] args) {
        int[][] matrix = {{1,  5,  9}, {10, 11, 13}, {12, 13, 15}};
        new KthSmallestInSortedMatrix().kthSmallest(matrix, 8);
    }

    public int kthSmallest(int[][] matrix, int k) {
        //minHeap, size = num of rows, kth smallest will be the element on kth pop
        PriorityQueue<Entry> pQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.value));
        int size = matrix.length;
        Map<Integer, Queue<Entry>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            Queue<Entry> queue = new LinkedList<>();
            for (int j = 0; j < matrix[i].length; j++) {
                queue.add(new Entry(i, matrix[i][j]));
            }
            map.put(i, queue);
        }
        for (int i = 0; i < size; i++) {
            pQueue.add(map.get(i).poll());
        }

        for (int i = 0; i < k - 1; i++) {
            Entry smallest = pQueue.peek();
            int row = smallest.row;
            System.out.println(pQueue.poll().value);
            if (map.get(row).size() > 0) {
                pQueue.add(map.get(row).poll());
            }
        }
        return pQueue.peek().value;
    }

    class Entry {
        int row;
        int value;
        Entry(int row, int value) {
            this.row = row;
            this.value = value;
        }
    }
}

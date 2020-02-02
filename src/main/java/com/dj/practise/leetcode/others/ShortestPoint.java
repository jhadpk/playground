package com.dj.practise.leetcode.others;

import java.util.*;

/**
 * @author deepakjha
 * @project playground
 */
public class ShortestPoint {

    public static void main(String[] args) {
        int[][] points = new int[2][2];
        points[0] = new int[]{1,3};
        points[1] = new int[]{-2, 2};
        new ShortestPoint().kClosest(points, 1);
    }

    public int[][] kClosest(int[][] points, int K) {
        int[][] output = new int[K][2];
        PriorityQueue<Node> nodes = new PriorityQueue<>(Comparator.comparingInt(o -> o.distance));
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int distance = (int) ((int) Math.pow(x, 2) + Math.pow(y, 2));
            nodes.add(new Node(x, y, distance));
        }

        for (int i = 0; i < K; i++) {
            int[] coord = new int[2];
            Node node = nodes.poll();
            if (null != node) {
                coord[0] = node.x;
                coord[1] = node.y;
                output[i] = coord;
            }
        }
        return output;
    }
}

class Node {
    int x;
    int y;
    int distance;

    Node (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
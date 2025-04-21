package com.dj.practise.leetcode.easy;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {8, 1, 4, 2, 9, 6, 5, 1};

        System.out.println(array);
        bubbleSort(array);
        System.out.println(array);
    }

    private static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

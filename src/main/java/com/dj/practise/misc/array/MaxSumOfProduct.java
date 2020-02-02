package com.dj.practise.misc.array;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfProduct {
    public static void main(String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(20);
        integerList.add(2);
        integerList.add(10);

        final int numberOfRotations = integerList.size();
        List<Integer> newList = integerList;
        final List<Integer> sumStore = new ArrayList<>();
        for (int j = 0; j < numberOfRotations; j++) {
            final List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < newList.size(); i++) {
                tempList.add(getProduct(i, newList.get(i)));
            }
            sumStore.add(getSum(tempList));
            newList = rotate(newList);
        }
        System.out.println(findMaxValue(sumStore));
    }

    private static int getProduct(final int index, final int value) {
        return index * value;
    }

    private static int getSum(final List<Integer> temporaryList) {
        int sum = 0;
        for (int i : temporaryList) {
            sum += i;
        }
        return sum;
    }

    private static List<Integer> rotate(final List<Integer> listToRotate) {
        final List<Integer> rotatedList = new ArrayList<>();
        final int size = listToRotate.size();
        final int firstElement = listToRotate.get(0);
        for (int i = 0; i < size - 1; i++) {
            rotatedList.add(listToRotate.get(i + 1));
        }
        rotatedList.add(firstElement);
        return rotatedList;
    }

    private static int findMaxValue(final List<Integer> integerList) {
        int maxVal = integerList.get(0);
        for (int val : integerList) {
            if (maxVal < val) {
                maxVal = val;
            }
        }
        return maxVal;
    }
}

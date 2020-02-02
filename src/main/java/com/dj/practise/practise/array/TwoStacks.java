package com.dj.practise.practise.array;

/**
 * @author deepakjha on 12/17/19
 * @project playground
 */
public class TwoStacks {
    //https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/

    int size;
    int top1;
    int top2;
    int[] arr;

    TwoStacks(int size) {
        this.size = size;
        this.top1 = -1;
        this.top2 = size;
        this.arr = new int[size];
    }

    private void push1(final int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow error!");
        }
    }

    private void push2(final int x) {
        if (top2 > top1 + 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow error!");
        }
    }

    private int pop1() {
        if (top1 > -1) {
            int value = arr[top1];
            top1--;
            return value;
        } else {
            System.out.println("Stack underflow!");
        }
        return 0;
    }

    private int pop2() {
        if (top2 < size) {
            int value = arr[top2];
            top2++;
            return value;
        } else {
            System.out.println("Stack underflow!");
        }
        return 0;
    }

    public static void main(String args[])
    {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());
    }


}

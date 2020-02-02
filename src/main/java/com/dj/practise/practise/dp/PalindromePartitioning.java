package com.dj.practise.practise.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author deepakjha on 10/11/19
 * @project geeks-for-geeks
 * https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/
 */
public class PalindromePartitioning {

    private ArrayList<ArrayList<String>> createPartitions(final String input) {
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        List<String> inputChars = Arrays.asList(input.split(""));

        for (int i = 0; i < inputChars.size(); i++) {

        }

        return null;
    }

    private ArrayList<String> getPalindromePartitions(final String input) {
        ArrayList<String> output = new ArrayList<>();



        return null;
    }

    public static void main(String[] args) {
        new PalindromePartitioning().getPalindromePartitions("nitin");
    }
}

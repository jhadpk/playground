package com.dj.practise.leetcode.medium;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 12/17/19
 * @project geeks-for-geeks
 */
public class GenerateParenthesis {
    //https://leetcode.com/problems/generate-parentheses/


    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, n, "", result);
        return result;
    }


    private void generateParenthesisHelper(int numOfOpenRem, int numOfCloseRem, String str, List<String> result) {
        if (numOfOpenRem == 0 && numOfCloseRem == 0) {
            result.add(str);
            return;
        }

        if (numOfOpenRem > 0) {
            generateParenthesisHelper(numOfOpenRem - 1, numOfCloseRem, str + "(", result);
        }
        if (numOfOpenRem < numOfCloseRem) {
            generateParenthesisHelper(numOfOpenRem, numOfCloseRem - 1, str+")", result);
        }
    }
}

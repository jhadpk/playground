package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/9/20
 * @project playground
 */
public class ExcelSheetNumber {
    //https://leetcode.com/problems/excel-sheet-column-number/


    public static void main(String[] args) {
        System.out.println(new ExcelSheetNumber().titleToNumber("A"));
    }


    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }

}

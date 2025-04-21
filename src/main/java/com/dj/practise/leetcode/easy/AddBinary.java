package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 2/3/20
 * @project playground
 */
public class AddBinary {
    //https://leetcode.com/problems/add-binary/

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        if (a.equals("0")) return b;
        if (b.equals("0")) return a;
        int alen = a.length();
        int blen = b.length();
        int zeroes = Math.abs(alen - blen);
        if (zeroes > 0) {
            if (alen > blen) {
                b = prefixZeroes(b, zeroes);
            } else {
                a = prefixZeroes(a, zeroes);
            }
        }
        int i = a.length() - 1;
        int carry = 0;
        int sum;
        String result = "";
        while (i >= 0) {
            int aChar = Integer.parseInt(a.substring(i, i+1));
            int bChar = Integer.parseInt(b.substring(i, i+1));
            sum = aChar ^ bChar;
            if (i != a.length() - 1) {
                sum = carry ^ sum;
                int and = aChar & bChar;
                int or = aChar | bChar;
                if (carry == 1 && (and == 1 || or == 1)) {
                    carry = 1;
                } else if (and == 1) {
                    carry = 1;
                }else {
                    carry = 0;
                }
            } else {
                carry = aChar & bChar;
            }
            result = sum + result;
            i--;
        }

        if (carry == 1) {
            result = 1 + result;
        }
        return result;
    }

    private String prefixZeroes(String s, int zeroes) {
        for (int i = 0; i < zeroes; i++) {
            s = "0" + s;
        }
        return s;
    }

}

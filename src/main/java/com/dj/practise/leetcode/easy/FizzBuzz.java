package com.dj.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.List;


/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class FizzBuzz {
    //https://leetcode.com/problems/fizz-buzz/

    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 15 == 0) {
                sb.append("FizzBuzz");
            } else if (i % 3 == 0) {
                sb.append("Fizz");
            } else if (i % 5 == 0) {
                sb.append("Buzz");
            } else {
                sb.append(i);
            }
            output.add(sb.toString());
        }
        return output;
    }
}

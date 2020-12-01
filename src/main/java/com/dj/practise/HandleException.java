package com.dj.practise;

import com.dj.practise.aws.TestException;
import com.dj.practise.aws.TestExceptionExtend;


/**
 * @author deepakjha on 7/6/20
 * @project bigtext
 */
public class HandleException {


    private void testException(int x, int y) {
        if (x > y) {
            throw new TestExceptionExtend("x is greater than y");
        }
    }


    private String updateString(String s) {
        s += " updated";
        return s;
    }


    public static void main(String[] args) {
        try {

            String q = "hello:world test:query";
            q = new HandleException().updateString(q);
            System.out.println(q);
        } catch (TestException te) {
            System.out.println(te.getMessage());
        }
    }

}

package com.dj.practise.aws;

/**
 * @author deepakjha on 7/6/20
 * @project bigtext
 */
public class TestException extends RuntimeException {


    public TestException(String message) {
        super(message);
        System.out.println("test exception");
    }

}

package com.dj.practise.aws;

/**
 * @author deepakjha on 7/6/20
 * @project bigtext
 */
public class TestExceptionExtend extends TestException {

    public TestExceptionExtend(String message) {
        super(message);
        System.out.println("test exception extend");
    }
}

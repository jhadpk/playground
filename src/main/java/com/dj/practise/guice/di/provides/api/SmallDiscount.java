package com.dj.practise.guice.di.provides.api;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class SmallDiscount implements Discountable {

    @Override
    public int getDiscount() {
        return 5;
    }
}

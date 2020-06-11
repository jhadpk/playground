package com.dj.practise.guice.di.implementedBy.api;


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

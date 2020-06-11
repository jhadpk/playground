package com.dj.practise.guice.di.providerFactory.api;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class NoDiscount implements Discountable {
    @Override
    public int getDiscount() {
        return 0;
    }
}

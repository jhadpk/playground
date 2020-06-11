package com.dj.practise.guice.di.inject;

import com.dj.practise.guice.di.inject.api.BigDiscount;
import com.dj.practise.guice.di.inject.api.Discountable;
import com.google.inject.AbstractModule;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class DiscountAbstractModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Discountable.class).to(BigDiscount.class);
    }
}

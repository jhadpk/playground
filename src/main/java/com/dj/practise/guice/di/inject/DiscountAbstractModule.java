package com.dj.practise.guice.di.inject;

import com.dj.practise.guice.di.inject.api.BigDiscount;
import com.dj.practise.guice.di.inject.api.Discountable;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class DiscountAbstractModule extends AbstractModule {

    @Override
    protected void configure() {
        //bind(Discountable.class).to(BigDiscount.class);
    }

    @Singleton
    @Provides
    @Named("HELLO")
    public Discountable getBigDiscountHello() {
        System.out.println("HELLO big discount");
        return new BigDiscount();
    }

    @Singleton
    @Provides
    @Named("WORLD")
    public Discountable getBigDiscountWorld() {
        System.out.println("WORLD big discount");
        return new BigDiscount();
    }
}

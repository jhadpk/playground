package com.dj.practise.guice.di.implementedBy;

import com.google.inject.AbstractModule;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class DiscountAbstractModule extends AbstractModule {

    @Override
    protected void configure() {
        //Used @ImplementedBy on interface to directly bind
        //bind(Discountable.class).to(BigDiscount.class);
    }
}

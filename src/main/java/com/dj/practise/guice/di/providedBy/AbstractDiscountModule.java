package com.dj.practise.guice.di.providedBy;

import com.google.inject.AbstractModule;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class AbstractDiscountModule extends AbstractModule {
    @Override
    protected void configure() {
        //bind(Discountable.class).toProvider(DiscountProvider.class);   //dont need to have this binding as
        // @Provides does it for us
    }

}

package com.dj.practise.guice.di.explicitProvider;

import com.dj.practise.guice.di.explicitProvider.api.Discountable;
import com.google.inject.AbstractModule;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class AbstractDiscountModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).toProvider(DiscountProvider.class);
    }
}

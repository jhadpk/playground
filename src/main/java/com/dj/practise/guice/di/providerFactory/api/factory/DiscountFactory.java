package com.dj.practise.guice.di.providerFactory.api.factory;

import com.dj.practise.guice.di.providerFactory.api.Discountable;
import com.google.inject.ImplementedBy;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */

@ImplementedBy(DiscountFactoryImpl.class)
public interface DiscountFactory {
    Discountable getDiscountable(int timeOfDay);
}

package com.dj.practise.guice.di.providedBy.api;


import com.dj.practise.guice.di.providedBy.DiscountProvider;
import com.google.inject.ProvidedBy;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    int getDiscount();
}

package com.dj.practise.guice.di.implementedBy.api;

import com.google.inject.ImplementedBy;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */

@ImplementedBy(SmallDiscount.class)
public interface Discountable {
    int getDiscount();
}

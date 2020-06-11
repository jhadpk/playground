package com.dj.practise.guice.di.mapbinder;

import com.dj.practise.guice.di.mapbinder.api.Discountable;
import com.google.inject.Inject;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class CheckoutService {

    private final Discountable discountable;


    @Inject
    public CheckoutService(Discountable discountable) {this.discountable = discountable;}


    public int checkout(int amount) {
        return amount - discountable.getDiscount();
    }
}

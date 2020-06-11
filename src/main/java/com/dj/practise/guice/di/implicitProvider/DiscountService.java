package com.dj.practise.guice.di.implicitProvider;

import com.dj.practise.guice.di.implicitProvider.api.Discountable;
import com.google.inject.Inject;
import com.google.inject.Provider;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class DiscountService {

    private final Provider<Discountable> discountable;

    @Inject
    public DiscountService(Provider<Discountable> discountable) {
        this.discountable = discountable;
    }

    public int getDiscount(int total) {
        int discount = discountable.get().getDiscount();
        return total - discount;
    }

}

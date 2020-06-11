package com.dj.practise.guice.di.implementedBy;

import com.dj.practise.guice.di.implementedBy.api.Discountable;
import com.google.inject.Inject;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class DiscountService {

    private final Discountable discountable;

    @Inject
    public DiscountService(Discountable discountable) {
        this.discountable = discountable;
    }

    public int getDiscount(int total) {
        int discount = discountable.getDiscount();
        return total - discount;
    }

}

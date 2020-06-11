package com.dj.practise.guice.di.provides;

import com.dj.practise.guice.di.provides.api.Discountable;
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


    // Works even like this, without the Provider, as simple interface.
    //private final Discountable discountable;
    //
    //@Inject
    //public DiscountService(Discountable discountable) {
    //    this.discountable = discountable;
    //}
    //
    //public int getDiscount(int total) {
    //    int discount = discountable.getDiscount();
    //    return total - discount;
    //}

}

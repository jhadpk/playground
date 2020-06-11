package com.dj.practise.guice.di.providerFactory;

import com.dj.practise.guice.di.providerFactory.api.factory.DiscountFactory;
import com.google.inject.Inject;

import java.time.LocalTime;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class CheckoutService {

    private final DiscountFactory discountFactory;


    @Inject
    public CheckoutService(DiscountFactory discountFactory) {this.discountFactory = discountFactory;}


    public int checkout(int amount) {
        int hour = LocalTime.now().getHour();
        //int hour = 16;
        return amount - discountFactory.getDiscountable(hour).getDiscount();
    }
}

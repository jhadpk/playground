package com.dj.practise.guice.di.providedBy;

import com.dj.practise.guice.di.providedBy.api.BigDiscount;
import com.dj.practise.guice.di.providedBy.api.Discountable;
import com.dj.practise.guice.di.providedBy.api.SmallDiscount;
import com.google.inject.Provider;

import java.time.LocalTime;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class DiscountProvider implements Provider<Discountable> {

    @Override
    public Discountable get() {
        int hour = LocalTime.now().getHour();
        System.out.println("Time of day : " +  hour);
        if (isBigDiscount(hour)) {
            return new BigDiscount();
        } else {
            return new SmallDiscount();
        }
    }

    private boolean isBigDiscount(int hour) {
        return (hour >= 0 && hour < 8) || (hour > 20 && hour <= 23);
    }
}

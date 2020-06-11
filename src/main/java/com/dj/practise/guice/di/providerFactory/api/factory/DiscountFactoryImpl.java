package com.dj.practise.guice.di.providerFactory.api.factory;

import com.dj.practise.guice.di.providerFactory.DiscountOption;
import com.dj.practise.guice.di.providerFactory.api.Discountable;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Map;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */

@Singleton
public class DiscountFactoryImpl implements DiscountFactory {

    private final Map<DiscountOption, Discountable> discountableBinder;


    @Inject
    public DiscountFactoryImpl(Map<DiscountOption, Discountable> discountableBinder) {
        this.discountableBinder = discountableBinder;
    }


    @Override
    public Discountable getDiscountable(int timeOfDay) {

        if (isBigDiscount(timeOfDay)) {
            return discountableBinder.get(DiscountOption.BIG_DISCOUNT);
        } else if (isSmallDiscount(timeOfDay)) {
            return discountableBinder.get(DiscountOption.SMALL_DISCOUNT);
        } else {
            return discountableBinder.get(DiscountOption.NO_DISCOUNT);
        }
    }

    private boolean isBigDiscount(int timeOfDay) {
        return (timeOfDay >= 0 && timeOfDay <= 5) || (timeOfDay >= 20 && timeOfDay <= 23);
    }

    private boolean isSmallDiscount(int timeOfDay) {
        return (timeOfDay > 5 && timeOfDay <= 10) || (timeOfDay >= 15 && timeOfDay < 20);
    }

}

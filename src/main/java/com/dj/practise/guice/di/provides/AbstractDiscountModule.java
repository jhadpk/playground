package com.dj.practise.guice.di.provides;

import com.dj.practise.guice.di.provides.api.BigDiscount;
import com.dj.practise.guice.di.provides.api.Discountable;
import com.dj.practise.guice.di.provides.api.SmallDiscount;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.time.LocalTime;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class AbstractDiscountModule extends AbstractModule {
    @Override
    protected void configure() {
        //bind(Discountable.class).toProvider(DiscountProvider.class);   //dont need to have this binding as @Provides does it for us
    }


    @Provides //provides the Discountable impl based on condition
    public Discountable get(){
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

package com.dj.practise.guice.di.mapbinder;

import com.dj.practise.guice.di.mapbinder.api.Discountable;
import com.google.inject.Inject;
import com.google.inject.Provider;

import java.util.Map;
import java.util.Random;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class DiscountableProvider implements Provider<Discountable> {

    private final Random random;
    private final Map<Integer, Discountable> mapBinder;


    @Inject
    public DiscountableProvider(Random random, Map<Integer, Discountable> mapBinder) {
        this.random = random;
        this.mapBinder = mapBinder;
    }


    @Override
    public Discountable get() {
        return mapBinder.get(random.nextInt(mapBinder.size()));
    }
}

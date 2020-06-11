package com.dj.practise.guice.di.mapbinder;

import com.dj.practise.guice.di.mapbinder.api.BigDiscount;
import com.dj.practise.guice.di.mapbinder.api.Discountable;
import com.dj.practise.guice.di.mapbinder.api.NoDiscount;
import com.dj.practise.guice.di.mapbinder.api.SmallDiscount;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

import java.util.Random;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class AbstractDiscountModule extends AbstractModule {
    @Override
    protected void configure() {

        MapBinder<Integer, Discountable> mapBinder = MapBinder.newMapBinder(binder(), Integer.class, Discountable.class);
        mapBinder.addBinding(0).to(BigDiscount.class);
        mapBinder.addBinding(1).to(SmallDiscount.class);
        mapBinder.addBinding(2).to(NoDiscount.class);

        //bind(Random.class).toInstance(new Random(10)); we can set constructor parameter value like this.
        bind(Discountable.class).toProvider(DiscountableProvider.class);
    }

}

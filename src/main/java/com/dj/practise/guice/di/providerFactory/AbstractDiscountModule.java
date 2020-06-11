package com.dj.practise.guice.di.providerFactory;

import com.dj.practise.guice.di.providerFactory.api.BigDiscount;
import com.dj.practise.guice.di.providerFactory.api.Discountable;
import com.dj.practise.guice.di.providerFactory.api.NoDiscount;
import com.dj.practise.guice.di.providerFactory.api.SmallDiscount;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;


/**
 * @author deepakjha on 6/11/20
 * @project bigtext
 */
public class AbstractDiscountModule extends AbstractModule {
    @Override
    protected void configure() {

        MapBinder<DiscountOption, Discountable> mapBinder = MapBinder.newMapBinder(binder(), DiscountOption.class, Discountable.class);
        mapBinder.addBinding(DiscountOption.BIG_DISCOUNT).to(BigDiscount.class);
        mapBinder.addBinding(DiscountOption.SMALL_DISCOUNT).to(SmallDiscount.class);
        mapBinder.addBinding(DiscountOption.NO_DISCOUNT).to(NoDiscount.class);

        //bind(Random.class).toInstance(new Random(10)); we can set constructor parameter value like this.
    }

}

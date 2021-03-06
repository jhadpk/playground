package com.dj.practise.guice.di.inject;

import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class MainClass {

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountAbstractModule());
        DiscountService discountService = guice.getInstance(DiscountService.class);

        discountService.printHello();
        //discountService.printWorld();

        //System.out.println(discountService.getDiscount(100));
    }
}

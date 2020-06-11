package com.dj.practise.guice.di.implicitProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class MainClass {

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(); // we dont have an abstract module
        DiscountService discountService = guice.getInstance(DiscountService.class);

        System.out.println(discountService.getDiscount(100));
    }
}

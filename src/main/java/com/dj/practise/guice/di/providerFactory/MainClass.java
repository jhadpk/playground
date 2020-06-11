package com.dj.practise.guice.di.providerFactory;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class MainClass {

    private final CheckoutService checkoutService;

    @Inject
    public MainClass(CheckoutService checkoutService) {this.checkoutService = checkoutService;}

    void start() {
        System.out.println(checkoutService.checkout(100));
    }

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new AbstractDiscountModule());
        MainClass mainClass = guice.getInstance(MainClass.class);

        mainClass.start();
    }
}

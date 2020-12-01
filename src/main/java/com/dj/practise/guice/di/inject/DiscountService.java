package com.dj.practise.guice.di.inject;

import com.dj.practise.guice.di.inject.api.Discountable;
import com.google.inject.Inject;
import com.google.inject.name.Named;


/**
 * @author deepakjha on 6/11/20
 * @project playground
 */
public class DiscountService {

    private final Discountable discountable1;
    private final Discountable discountable2;

    //private final Discountable discountableWorld;


    @Inject
    public DiscountService(@Named("WORLD") Discountable discountable1, @Named("WORLD") Discountable discountable2) {
        this.discountable1 = discountable1;
        this.discountable2 = discountable2;

        //this.discountableWorld = discountableWorld;
    }

    //public int getDiscount(int total) {
    //    int discount = discountable.getDiscount();
    //    return total - discount;
    //}

    public void printHello() {
        //System.out.println("HELLO BEGIN");

        System.out.println( "discountable 1 : " + discountable1.hashCode());
        System.out.println( "discountable 2 : " + discountable2.hashCode());
        //discountable1.getDiscount();
        //System.out.println("HELLO DONE");
    }


    //public void printWorld() {
    //    System.out.println("WORLD BEGIN");
    //    discountableWorld.getDiscount();
    //    System.out.println("WORLD DONE");
    //}
}

package com.dj.practise.guice.di.practise;

import com.dj.practise.guice.di.practise.api.HemingwayAdapter;

import javax.inject.Inject;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */


public class GrammarBuilder {

    private final HemingwayAdapter hemingwayAdapter;

    @Inject
    public GrammarBuilder(HemingwayAdapter hemingwayAdapter) {
        this.hemingwayAdapter = hemingwayAdapter;
    }

    public void builderMethod() {
        System.out.println("HemingwayAdapter hashcode in Grammar Builder : " + hemingwayAdapter.hashCode());
        hemingwayAdapter.printIsLightWeight();
    }
}

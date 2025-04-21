package com.dj.practise.guice.di.practise;


import com.dj.practise.guice.di.practise.api.HemingwayAdapter;

import javax.inject.Inject;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */
public class Handler {

    private final HemingwayAdapter hemingwayAdapter;
    private final GrammarBuilder grammarBuilder;

    @Inject
    public Handler(final HemingwayAdapter hemingwayAdapter, final GrammarBuilder grammarBuilder) {
        this.hemingwayAdapter = hemingwayAdapter;
        this.grammarBuilder = grammarBuilder;
    }

    public void methodHandler() {
        System.out.println("HemingwayAdapter hashcode in Handler : " + hemingwayAdapter.hashCode());
        hemingwayAdapter.setIsLightWeight(true);
        System.out.println("2 HemingwayAdapter hashcode in Handler : " + hemingwayAdapter.hashCode());
        hemingwayAdapter.printIsLightWeight();
    }


    public void callGrammarBuilder() {
        System.out.println("HemingwayAdapter hashcode in Handler : " + hemingwayAdapter.hashCode());
        grammarBuilder.builderMethod();
    }
}

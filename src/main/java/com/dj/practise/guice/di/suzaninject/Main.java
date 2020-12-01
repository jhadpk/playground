package com.dj.practise.guice.di.suzaninject;

import lombok.RequiredArgsConstructor;

import javax.inject.Inject;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class Main {

    private final Handler handler;
    private final GrammarBuilder grammarBuilder;

    public static void main(String[] args) {


    }
}

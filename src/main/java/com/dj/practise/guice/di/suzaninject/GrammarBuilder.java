package com.dj.practise.guice.di.suzaninject;

import com.dj.practise.guice.di.suzaninject.api.HemingwayAdapter;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class GrammarBuilder {

    private final HemingwayAdapter hemingwayAdapter;

    public void builderMethod() {
        System.out.println("HemingwayAdapter hashcode in Grammar Builder : " + hemingwayAdapter.hashCode());
        hemingwayAdapter.printIsLightWeight();
    }
}

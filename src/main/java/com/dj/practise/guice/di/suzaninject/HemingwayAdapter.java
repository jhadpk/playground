package com.dj.practise.guice.di.suzaninject.api;

import lombok.Setter;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */
public class HemingwayAdapter {

    @Setter
    private Boolean isLightWeight;

    public void printIsLightWeight() {
        System.out.println(isLightWeight);
    }

}

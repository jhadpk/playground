package com.dj.practise.test;


import lombok.Setter;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */
public class Adapter {

    @Setter
    private Boolean isLightWeight = false;

    public void printIsLightWeight() {
        System.out.println(isLightWeight);
    }
}

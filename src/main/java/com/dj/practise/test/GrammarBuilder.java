package com.dj.practise.test;

import com.google.inject.Singleton;


/**
 * @author deepakjha on 10/20/20
 * @project inmobi-rtb-validator
 */
@Singleton
public class GrammarBuilder {

    public void build() {
        Adapter adapter = new Adapter();
        adapter.printIsLightWeight();
    }

}

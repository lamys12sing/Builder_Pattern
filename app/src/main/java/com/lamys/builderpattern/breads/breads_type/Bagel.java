package com.lamys.builderpattern.breads.breads_type;

import com.lamys.builderpattern.breads.Bread;

public class Bagel extends Bread {
    @Override
    public String name() {
        return "Bagel";
    }

    @Override
    public int calories() {
        return 250;
    }
}

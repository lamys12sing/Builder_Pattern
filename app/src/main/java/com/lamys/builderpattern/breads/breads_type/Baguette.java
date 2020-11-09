package com.lamys.builderpattern.breads.breads_type;

import com.lamys.builderpattern.breads.Bread;

public class Baguette extends Bread {
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 150;
    }
}

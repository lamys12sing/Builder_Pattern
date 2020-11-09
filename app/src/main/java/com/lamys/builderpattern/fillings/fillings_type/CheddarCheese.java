package com.lamys.builderpattern.fillings.fillings_type;

import com.lamys.builderpattern.fillings.Filling;

public class CheddarCheese extends Filling {
    @Override
    public String name() {
        return "Cheddar cheese";
    }

    @Override
    public int calories() {
        return 37;
    }
}

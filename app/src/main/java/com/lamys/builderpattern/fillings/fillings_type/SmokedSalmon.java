package com.lamys.builderpattern.fillings.fillings_type;

import com.lamys.builderpattern.fillings.Filling;

public class SmokedSalmon extends Filling {
    @Override
    public String name() {
        return "Smoked salmon";
    }

    @Override
    public int calories() {
        return 400;
    }
}

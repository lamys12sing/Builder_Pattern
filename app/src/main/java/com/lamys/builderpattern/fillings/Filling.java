package com.lamys.builderpattern.fillings;

import com.lamys.builderpattern.Ingredient;

public abstract class Filling implements Ingredient {
    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}

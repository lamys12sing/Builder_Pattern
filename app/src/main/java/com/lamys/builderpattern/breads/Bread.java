package com.lamys.builderpattern.breads;

import com.lamys.builderpattern.Ingredient;

public abstract class Bread implements Ingredient {
    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}

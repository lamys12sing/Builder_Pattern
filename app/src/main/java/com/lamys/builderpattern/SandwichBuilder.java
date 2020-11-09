package com.lamys.builderpattern;

import com.lamys.builderpattern.breads.breads_type.Baguette;
import com.lamys.builderpattern.fillings.fillings_type.CheddarCheese;

public class SandwichBuilder {
    //off the shelf sandwich
    public static Sandwich readyMade(){
        Sandwich sandwich = new Sandwich();

        sandwich.addIngredient(new Baguette());
        sandwich.addIngredient(new CheddarCheese());

        return sandwich;
    }

    //Customized sandwich
    public static Sandwich build(Sandwich s, Ingredient i){
        s.addIngredient(i);
        return s;
    }
}

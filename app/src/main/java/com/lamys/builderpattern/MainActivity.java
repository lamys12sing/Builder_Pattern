package com.lamys.builderpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lamys.builderpattern.breads.breads_type.Bagel;
import com.lamys.builderpattern.fillings.fillings_type.SmokedSalmon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Build a customized sandwich
        SandwichBuilder builder = new SandwichBuilder();
        Sandwich custom = new Sandwich();

        //Simulate user selections
        custom = builder.build(custom, new SmokedSalmon());
        custom = builder.build(custom, new Bagel());
        Log.d("MainActivity Tag", "CUSTOMIZED");
        custom.getSandwich();
        custom.getCalories();

        //Build a ready made sandwich
        Sandwich offTheSelf = SandwichBuilder.readyMade();
        Log.d("MainActivity Tag", "READY MADE");
        offTheSelf.getSandwich();
        offTheSelf.getCalories();
    }
}
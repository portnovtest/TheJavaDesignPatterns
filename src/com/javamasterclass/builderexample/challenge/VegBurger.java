package com.javamasterclass.builderexample.challenge;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 3.50;
    }
}

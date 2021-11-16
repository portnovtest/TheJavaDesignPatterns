package com.javamasterclass.builderexample.challenge;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 4.50;
    }
}

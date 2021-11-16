package com.javamasterclass.builderexample.challenge;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 1.75;
    }
}

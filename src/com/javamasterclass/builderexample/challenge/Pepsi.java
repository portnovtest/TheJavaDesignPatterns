package com.javamasterclass.builderexample.challenge;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 1.50;
    }
}

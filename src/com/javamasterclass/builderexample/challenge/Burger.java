package com.javamasterclass.builderexample.challenge;

public abstract class Burger implements Item {
    @Override
    public Packaging packaging() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}

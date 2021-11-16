package com.javamasterclass.builderexample.challenge;

public abstract class ColdDrink implements Item {
    @Override
    public Packaging packaging() {
        return new Bottle();
    }
}

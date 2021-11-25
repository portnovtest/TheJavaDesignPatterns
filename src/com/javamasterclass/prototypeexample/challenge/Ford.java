package com.javamasterclass.prototypeexample.challenge;

public class Ford extends BasicCar implements Cloneable {
    public Ford(String model) {
        modelName = model;
    }

    @Override
    public Ford clone() {
        return (Ford) super.clone();
    }
}

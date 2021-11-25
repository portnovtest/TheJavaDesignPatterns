package com.javamasterclass.prototypeexample.challenge;

public class Nano extends BasicCar implements Cloneable {
    public Nano(String model) {
        modelName = model;
    }

    @Override
    public Nano clone() {
        return (Nano) super.clone();
    }
}

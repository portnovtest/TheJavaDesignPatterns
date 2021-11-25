package com.javamasterclass.prototypeexample.challenge;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    protected String modelName;
    protected int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public static int setPrice() {
        return new Random().nextInt(100000);
    }

    public BasicCar clone() {
        BasicCar clone = null;

        try {
            clone = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

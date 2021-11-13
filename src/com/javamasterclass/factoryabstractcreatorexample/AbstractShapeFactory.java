package com.javamasterclass.factoryabstractcreatorexample;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    // other helper methods
}

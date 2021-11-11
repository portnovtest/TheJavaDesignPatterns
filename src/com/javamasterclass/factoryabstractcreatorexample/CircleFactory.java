package com.javamasterclass.factoryabstractcreatorexample;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}

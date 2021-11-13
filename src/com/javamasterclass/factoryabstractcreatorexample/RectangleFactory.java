package com.javamasterclass.factoryabstractcreatorexample;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

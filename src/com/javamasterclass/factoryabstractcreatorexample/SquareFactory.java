package com.javamasterclass.factoryabstractcreatorexample;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}

package com.javamasterclass.adapterobjectcompositionexample2;

public class Calculator implements CalculatorInterface {
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length * rectangle.width;
    }
}

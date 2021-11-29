package com.javamasterclass.bridgeexample.challenge;

public abstract class Shape {
    protected ColorInterface color;

    protected Shape(ColorInterface color) {
        this.color = color;
    }

    abstract void drawShape(int border);

    abstract void modifyBorder(int border, int increment);
}

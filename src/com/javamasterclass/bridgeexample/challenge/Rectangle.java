package com.javamasterclass.bridgeexample.challenge;

public class Rectangle extends Shape {
    protected Rectangle(ColorInterface color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This Rectangle is colored with ");
        color.fillWithColor(border);
    }

    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border *= increment;
        drawShape(border);
    }
}

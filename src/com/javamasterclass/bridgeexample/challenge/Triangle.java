package com.javamasterclass.bridgeexample.challenge;

public class Triangle extends Shape {

    protected Triangle(ColorInterface color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This Triangle is colored with ");
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

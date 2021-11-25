package com.javamasterclass.prototypeexample;

public class Rectangle extends Shape {
    public Rectangle() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.printf("Inside %s::draw() method", type);
    }
}

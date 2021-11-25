package com.javamasterclass.prototypeexample;

public class Circle extends Shape {
    public Circle() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.printf("Inside %s::draw() method", type);
    }

}

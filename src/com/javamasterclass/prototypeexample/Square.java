package com.javamasterclass.prototypeexample;

public class Square extends Shape {
    public Square() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.printf("Inside %s::draw() method", type);
    }
}

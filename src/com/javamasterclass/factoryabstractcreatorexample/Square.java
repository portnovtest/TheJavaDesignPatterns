package com.javamasterclass.factoryabstractcreatorexample;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.printf("Inside %s::draw() method.%n", getClass().getSimpleName());
    }
}

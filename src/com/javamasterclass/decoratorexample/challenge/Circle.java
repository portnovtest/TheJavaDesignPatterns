package com.javamasterclass.decoratorexample.challenge;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: " + getClass().getSimpleName());
    }
}

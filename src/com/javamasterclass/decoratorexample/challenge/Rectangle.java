package com.javamasterclass.decoratorexample.challenge;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: " + getClass().getSimpleName());
    }
}

package com.javamasterclass.factoryconcretecreatorexample;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("Inside %s::draw() method.%n", getClass().getSimpleName());
    }
}

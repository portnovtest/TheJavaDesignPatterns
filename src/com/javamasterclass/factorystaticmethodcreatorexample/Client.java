package com.javamasterclass.factorystaticmethodcreatorexample;

import static com.javamasterclass.factorystaticmethodcreatorexample.ShapeFactory.getShape;

public class Client {
    public static void main(String[] args) {
        // get an object of Circle and call its draw method.
        var shape1 = getShape("Circle");
        // call draw method on circle
        shape1.draw();
        var shape2 = getShape("Rectangle");
        shape2.draw();
        var shape3 = getShape("Square");
        shape3.draw();
    }
}

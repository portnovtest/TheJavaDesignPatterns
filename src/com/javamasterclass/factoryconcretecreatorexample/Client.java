package com.javamasterclass.factoryconcretecreatorexample;

public class Client {
    public static void main(String[] args) {
        var shapeFactory = new ShapeFactory();
        // get an object of Circle and call its draw method.
        var shape1 = shapeFactory.getShape("Circle");
        // call draw method on circle
        shape1.draw();
        var shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        var shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}

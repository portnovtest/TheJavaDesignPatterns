package com.javamasterclass.abstractfactorymethodexample;

public class Client {
    public static void main(String[] args) {
        // get shape factory
        var shapeFactory = FactoryProducer.getFactory("Shape");

        // get an object of Shape Circle
        var shape1 = shapeFactory.getShape("circle");

        // call draw method of Shape Circle
        shape1.draw();

        // get an object of Shape Rectangle
        var shape2 = shapeFactory.getShape("rectangle");

        // call draw method of Shape Rectangle
        shape2.draw();

        // get an object of Shape Square
        var shape3 = shapeFactory.getShape("square");

        // call draw method of Shape Square
        shape3.draw();

        // get color factory
        var colorFactory = FactoryProducer.getFactory("Color");

        var color1 = colorFactory.getColor("red");
        color1.fill();
        var color2 = colorFactory.getColor("blue");
        color2.fill();
        var color3 = colorFactory.getColor("green");
        color3.fill();
    }
}

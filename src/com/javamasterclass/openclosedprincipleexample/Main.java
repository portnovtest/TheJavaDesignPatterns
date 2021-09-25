package com.javamasterclass.openclosedprincipleexample;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

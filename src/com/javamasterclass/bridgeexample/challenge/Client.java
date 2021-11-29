package com.javamasterclass.bridgeexample.challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("***BRIDGE PATTERN***");

        // Coloring Green Triangle
        System.out.println("\nColoring Triangle:");
        var green = new GreenColor();
        var triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        // Coloring Red Rectangle
        System.out.println("\nColoring Rectangle:");
        var red = new RedColor();
        var rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 2);
    }
}

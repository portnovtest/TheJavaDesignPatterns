package com.javamasterclass.abstractfactorymethodexample;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return switch (color.toUpperCase()) {
            case "RED" -> new Red();
            case "BLUE" -> new Blue();
            case "GREEN" -> new Green();
            default -> throw new IllegalStateException("Unexpected value");
        };
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}

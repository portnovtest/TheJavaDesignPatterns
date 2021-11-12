package com.javamasterclass.abstractfactorymethodexample;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return switch (shapeType.toUpperCase()) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> throw new IllegalStateException("Unexpected value");
        };
    }
}

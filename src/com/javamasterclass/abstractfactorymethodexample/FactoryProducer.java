package com.javamasterclass.abstractfactorymethodexample;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        return switch (choice.toUpperCase()) {
            case "SHAPE" -> new ShapeFactory();
            case "COLOR" -> new ColorFactory();
            default -> throw new IllegalStateException("Unexpected value");
        };
    }
}

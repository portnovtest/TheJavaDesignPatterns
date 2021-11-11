package com.javamasterclass.factoryconcretecreatorexample;

public class ShapeFactory {
    // use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType != null) {
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new Square();
            } else {
                throw new RuntimeException("This shape is not supported!");
            }
        } else {
            return null;
        }
    }
}

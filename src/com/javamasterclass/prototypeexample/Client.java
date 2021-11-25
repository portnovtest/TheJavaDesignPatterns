package com.javamasterclass.prototypeexample;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        var clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.printf("Shape : %s\n", clonedShape1.getType());

        var clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.printf("Shape : %s\n", clonedShape2.getType());

        var clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.printf("Shape : %s", clonedShape3.getType());
    }
}

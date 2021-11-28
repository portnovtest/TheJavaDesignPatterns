package com.javamasterclass.adapterobjectcompositionexample2;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");
        var triangle = new Triangle(20, 10);
        var calculatorAdapter = new CalculatorAdapter(triangle);

        System.out.println("Area of Triangle is: " + calculatorAdapter.getArea(null));
    }
}

package com.javamasterclass.prototypeexample.challenge;

public class PrototypePatternEx {
    public static void main(String[] args) {
        System.out.println("***Prototype Demo***");
        BasicCarCache.loadCarCache();
        var car1 = (BasicCar) BasicCarCache.getCar("Green Nano");
        car1.price += BasicCar.setPrice();
        System.out.printf("Car is: %s and it's price is $%.2f%n", car1.getModelName(), car1.getPrice());

        var car2 = (BasicCar) BasicCarCache.getCar("Ford Yellow");
        car2.price += BasicCar.setPrice();
        System.out.printf("Car is: %s and it's price is $%.2f%n", car2.getModelName(), car2.getPrice());
    }
}

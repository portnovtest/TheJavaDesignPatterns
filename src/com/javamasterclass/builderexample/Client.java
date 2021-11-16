package com.javamasterclass.builderexample;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");

        var director = new Director();
        var carBuilder = new Car();
        var motorcycleBuilder = new Motorcycle();
        // making a car
        director.construct(carBuilder);
        var p1 = carBuilder.getVehicle();
        p1.show();

        // making a motorcycle
        director.construct(motorcycleBuilder);
        var p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}

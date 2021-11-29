package com.javamasterclass.bridgeexample;

public class Client {
    public static void main(String[] args) {
        var vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        var vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}

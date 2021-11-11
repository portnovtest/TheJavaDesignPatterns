package com.javamasterclass.factoryconcretecreatorexample.challenge;

public class Client {
    public static void main(String[] args) {
        var animalFactory = new AnimalFactory();
        var animal1 = animalFactory.getAnimal("Duck");
        animal1.speak();
        var animal2 = animalFactory.getAnimal("Tiger");
        animal2.speak();
        var animal3 = animalFactory.getAnimal("Lion");
        animal3.speak();
    }
}

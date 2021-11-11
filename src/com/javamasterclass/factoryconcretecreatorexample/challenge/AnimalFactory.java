package com.javamasterclass.factoryconcretecreatorexample.challenge;

public class AnimalFactory {
    public Animal getAnimal(String animalType){
        if (animalType != null){
            if (animalType.equalsIgnoreCase("Duck")){
                return new Duck();
            } else if (animalType.equalsIgnoreCase("Tiger")){
                return new Tiger();
            } else {
                throw new RuntimeException("This animal type is not supported!");
            }
        } else {
            return null;
        }
    }
}
